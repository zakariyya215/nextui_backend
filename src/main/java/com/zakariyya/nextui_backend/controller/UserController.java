package com.zakariyya.nextui_backend.controller;

import com.zakariyya.nextui_backend.dto.req.LoginReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author : wangwenhao
 * @since : 2024/11/22 10:15
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 用户登录
     */
    @PostMapping("doLogin")
    public String doLogin(LoginReq loginReq) {
        return "登陆成功";
    }
}
