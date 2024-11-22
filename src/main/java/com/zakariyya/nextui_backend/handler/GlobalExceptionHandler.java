package com.zakariyya.nextui_backend.handler;

import com.zakariyya.nextui_backend.exception.BusinessException;
import com.zakariyya.nextui_backend.util.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 *
 * @author : wangwenhao
 * @since : 2024/11/22 10:38
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity handleBusinessException(BusinessException exception){
        return ResponseEntity.error(exception.getMessage());
    }
}
