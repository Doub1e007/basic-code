package com.doub1e.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns = "/*")  // 设置拦截路径 拦截所有路径
//@WebFilter(urlPatterns = "/login")  // 拦截具体路径
//@WebFilter(urlPatterns = "/emps/*")  // 目录拦截
public class DemoFilter implements Filter {
    // 初始化方法 在web服务器启动时会触发一次
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("DemoFilter init");
    }

    // 每次拦截到请求 会触发该方法 会调用多次
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("DemoFilter doFilter放行前逻辑");
        // 放行
        filterChain.doFilter(servletRequest, servletResponse);

        log.info("DemoFilter doFilter放行后逻辑");
    }

    // 销毁方法 在web服务器正常关闭时会触发一次
    @Override
    public void destroy() {
        log.info("DemoFilter destroy");
    }
}
