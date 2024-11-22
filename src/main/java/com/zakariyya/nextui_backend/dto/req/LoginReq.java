package com.zakariyya.nextui_backend.dto.req;

import lombok.Data;

/** 登录请求体
 * @author : wangwenhao
 * @since : 2024/11/22 10:17
 */
@Data
public class LoginReq {
    /**
     * 邮箱
     */
    private String email;
    /**
     * 密码
     */
    private String password;
}
