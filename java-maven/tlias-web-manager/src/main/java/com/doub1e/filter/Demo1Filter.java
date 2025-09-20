package com.doub1e.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
//@WebFilter(urlPatterns = "/*")  // 设置拦截路径 拦截所有路径

public class Demo1Filter implements Filter {
    // 每次拦截到请求 会触发该方法 会调用多次
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Demo1Filter doFilter放行前逻辑");
        // 放行
        filterChain.doFilter(servletRequest, servletResponse);

        log.info("Demo1Filter doFilter放行后逻辑");
    }

}
