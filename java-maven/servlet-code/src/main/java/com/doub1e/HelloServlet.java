package com.doub1e;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 一个Servlet类 需要实现接口Servlet（可以选择继承HttpServlet
 */
@WebServlet(urlPatterns = "/hello")  //定义请求路径
//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.获取请求参数值
        String name = req.getParameter("name");

        // 2.响应结果到浏览器
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<h1>Hello " + name + "!</h1>");

    }
}
