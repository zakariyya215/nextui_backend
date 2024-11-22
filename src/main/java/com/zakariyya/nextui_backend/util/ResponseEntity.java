package com.zakariyya.nextui_backend.util;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

/**
 * 通用响应体
 *
 * @author : wangwenhao
 * @since : 2024/11/22 10:28
 */
@Data
public class ResponseEntity {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息体
     */
    private String msg;
    /**
     * 响应体
     */
    private Object data;

    public ResponseEntity(HttpStatus httpStatus, String msg, Object body) {
        this.code = httpStatus.value();
        this.msg = msg;
        this.data = body;
    }

    public static ResponseEntity OK(Object body) {
        return new ResponseEntity(HttpStatus.OK,null,body);
    }

    public static ResponseEntity error(String message) {
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR,message,null);
    }
}
