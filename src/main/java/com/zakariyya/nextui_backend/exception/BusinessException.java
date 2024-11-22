package com.zakariyya.nextui_backend.exception;

/**
 * @author : wangwenhao
 * @since : 2024/11/22 10:41
 */
public class BusinessException extends RuntimeException {
    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }
}
