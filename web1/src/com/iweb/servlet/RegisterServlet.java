package com.iweb.servlet;

import java.io.*;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;

import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import org.apache.commons.dbutils.QueryRunner;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
    private String message;

    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username =
                request.getParameter("username");
    }

    private QueryRunner qr =
            new QueryRunner(DruidUtil.getDataSource());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //解决中文乱码
        request.setCharacterEncoding("UTF-8");
//        String username =
//                request.getParameter("username");
//        String password =
//                request.getParameter("password");
////        String birth =
////                request.getParameter("birth");
//        String gender =
//                request.getParameter("gender");
//        String description =
//                request.getParameter("description");
//        String hobby =
//                request.getParameter("hobby");
//
//        Map<String,String[]> parameterMap =
//                request.getParameterMap();
        User user =
                FormToBean.FormToBean(User.class, request.getParameterMap());

        String sql =
                "insert into t_user(username,password,gender,hobby,description) values(?,?,?,?,?)";

        //Object..params
        try {
            qr.update(sql,user.getUsername(),user.getPassword(),user.getGender(), Arrays.toString(user.getHobby()),user.getDescription());
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
