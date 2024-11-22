package com.zakariyya.nextui_backend.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * 登录鉴权token过滤器
 *
 * @author : wangwenhao
 * @since : 2024/11/22 10:23
 */
@Slf4j
@Component
public class AuthenticationTokenFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,@NonNull HttpServletResponse response,@NonNull FilterChain filterChain) throws ServletException, IOException {
        StringBuffer requestURL = request.getRequestURL();
        String requestURI = request.getRequestURI();
        log.debug(requestURL.toString(),requestURI);
        filterChain.doFilter(request,response);
    }
}
