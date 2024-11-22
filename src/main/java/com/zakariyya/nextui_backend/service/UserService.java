package com.zakariyya.nextui_backend.service;

import com.zakariyya.nextui_backend.dto.req.LoginReq;
import jakarta.validation.Valid;

/**
 * 用户业务接口
 *
 * @author : wangwenhao
 * @since : 2024/11/22 15:03
 */
public interface UserService {

    String doLogin(@Valid LoginReq loginReq);
}
