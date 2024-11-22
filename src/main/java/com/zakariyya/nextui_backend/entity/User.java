package com.zakariyya.nextui_backend.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author : wangwenhao
 * @since : 2024/11/22 16:59
 */
@Data
public class User implements Serializable {
    @Id
    private Long id;
    private String email;
    private String password;

}
