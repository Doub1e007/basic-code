package com.iweb.servlet;

import com.iweb.pojo.User;
import com.iweb.service.UserService;
import com.iweb.service.impl.UserServiceImpl;
import com.iweb.util.FormToBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.dbutils.QueryRunner;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
    private String message;

    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String username =
//                request.getParameter("username");
    }

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setCharacterEncoding("UTF-8");
        User user =
                FormToBean.FormToBean(User.class, request.getParameterMap());

        boolean loginok = userService.register(user);
        if(loginok){
            //注册成功 跳转到注册成功页面

            //1 重定向
           // response.sendRedirect("/JMY/success.html");

            //2 转发
            request.getRequestDispatcher("/success.html")
                    .forward(request,response);



        }

        //解决中文乱码
        request.setCharacterEncoding("UTF-8");


    }
}
