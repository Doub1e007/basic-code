package com.doub1e;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.设置响应状态码 [不推荐设置状态]
        resp.setStatus(HttpServletResponse.SC_NOT_FOUND);

        // 2.设置响应头
        resp.setHeader("Doub1e007","java-maven");
        //设置响应编码和响应数据类型 text/html;得写在前
        resp.setHeader("content-type","text/html;charset=UTF-8");

        // 3.设置响应数据r
        String name = req.getParameter("name");
        resp.getWriter().write("<h1>Hello " + name + "</h1>");



    }
}
