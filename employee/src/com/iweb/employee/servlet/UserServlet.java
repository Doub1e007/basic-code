package com.iweb.employee.servlet;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONNull;
import cn.hutool.json.JSONUtil;
import com.iweb.employee.pojo.User;
import com.iweb.employee.service.UserService;
import com.iweb.employee.service.impl.UserServiceImpl;
import com.iweb.employee.util.FormToBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/user")
@MultipartConfig
public class UserServlet extends BasicServlet {
    private UserService userService = new UserServiceImpl();

    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户输入的验证码
        String code = req.getParameter("code");

        //获取正确的验证码
        HttpSession session = req.getSession();

        String correctCode = (String) session.getAttribute("code");

        if (!correctCode.equalsIgnoreCase(code)) {
            //用户输入的验证码错误 提示信息
            req.setAttribute("msg", "验证码输入错误");
            //跳转到登录页面
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            User user = FormToBean.FormToBean(User.class, req.getParameterMap());
            user = userService.login(user);
            if (user != null) {
                //登录成功 跳转到首页
                //存储用户信息，使用session
                session.setAttribute("user", user);
                //设置session有效期 单位 秒
                session.setMaxInactiveInterval(10);
                //重定向到系统首页
                resp.sendRedirect("/employee/index.jsp");

            } else {
                //登录不成功
                req.setAttribute("msg", "用户名或密码输入错误");
                //跳转到登录页面
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
            }

        }
    }

    public void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    public void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //清空session
        HttpSession session = req.getSession();
        session.removeAttribute("user");
        session.invalidate();
        //跳转到登录界面
        resp.sendRedirect("/employee/login.jsp");
    }

//异步校验用户输入的原始密码是否正确
    public void verifyOldPwd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户输入的原始密码
        String password = req.getParameter("password");
        //取出session中的用户
        User user = (User)req.getSession().getAttribute("user");
        if(!user.getPassword().equals(password)){
            //给客户端响应结果  通过IO流传递信息
            //resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("原始密码输入不正确");
        }
    }
    //修改密码


    public void updatePwd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //用户输入的新密码
        String newpass = req.getParameter("newpass");
        //取出session中的用户
        User user = (User)req.getSession().getAttribute("user");
        user.setPassword(newpass);
        boolean updateOk = userService.updatePwd(user);
        if(updateOk){
            //跳转到登录界面
            resp.sendRedirect("/employee/login.jsp");
        }
    }
    //异步上传头像


    public void upload(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收文件数据
        Part part = req.getPart("file");

        //文件大小
        long size = part.getSize();

        //获取文件名
        String fileName = part.getSubmittedFileName();

        //防止文件重名
        fileName = System.currentTimeMillis() + fileName;

        //文件存储在服务器什么位置
        String realPath =
                req.getServletContext().getRealPath("/upload");
        File file = new File(realPath);
        if(!file.exists()){
            //如果目录不存在则创建带层级的目录
            file.mkdirs();
        }
        part.write(realPath+File.separator + fileName);

        //给客户端相应json对象
        Map<String,String> map = new HashMap<>();
        map.put("code","1");
        map.put("msg","上传文件成功");
        map.put("src","/employee/upload/"+fileName);
        String json = JSONUtil.toJsonStr(map);
        resp.getWriter().write(json);
    }
}
