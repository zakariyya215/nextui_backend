package com.zakariyya.nextui_backend.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.jwt.JWT;
import com.zakariyya.nextui_backend.dto.req.LoginReq;
import com.zakariyya.nextui_backend.entity.User;
import com.zakariyya.nextui_backend.exception.BusinessException;
import com.zakariyya.nextui_backend.repository.UserRepository;
import com.zakariyya.nextui_backend.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * @author : wangwenhao
 * @since : 2024/11/22 15:04
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;
    @Override
    public String doLogin(LoginReq loginReq) {
        return JWT.create()
                .setCharset(StandardCharsets.UTF_8)
                .setSigner("HS256", "gS1dN0qW1kU2pM0aS5bZ2mY6xH6nI8vC".getBytes())
                .setPayload(loginReq.getEmail(), loginReq)
                .setExpiresAt(DateUtil.nextMonth()).sign();
    }
}
