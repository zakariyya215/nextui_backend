package com.zakariyya.nextui_backend.dto.req;

import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "邮箱不能为空")
    private String email;
    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;
}
