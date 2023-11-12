package com.iweb.servlet;

import java.io.*;

import com.iweb.pojo.User;
import com.iweb.service.UserService;
import com.iweb.service.impl.UserServiceImpl;
import com.iweb.util.FormToBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    public void init() {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        User user = FormToBean.FormToBean(User.class, request.getParameterMap());
        boolean loginok = userService.login(user);

        if(loginok){
            //跳转到首页
            //response.sendRedirect("/JMY/index.html");

            //把用户数据放入session中
            HttpSession session = request.getSession();
            session.setAttribute("user",user);

            // request.setAttribute("user",user);
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }

    }
}
