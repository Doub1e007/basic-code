package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/request")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求方式
        String method = req.getMethod();
        System.out.println("method = " + method);

        //2.获取请求路径
        String uri = req.getRequestURI();
        StringBuffer url = req.getRequestURL();
        System.out.println("uri = " + uri);
        System.out.println("url = " + url);

        //3.获取协议
        String scheme = req.getScheme();
        System.out.println("scheme = " + scheme);

        //4.获取请求头(host
        String host = req.getHeader("Host");
        System.out.println("host = " + host);

        //5.获取请求参数
        String name = req.getParameter("name");
        System.out.println("name = " + name);

        //6.获取所有查询参数
        String queryString = req.getQueryString();
        System.out.println("queryString = " + queryString);
    }
}
