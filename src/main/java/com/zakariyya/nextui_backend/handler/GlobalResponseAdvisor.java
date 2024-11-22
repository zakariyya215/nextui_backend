package com.zakariyya.nextui_backend.handler;

import com.alibaba.fastjson2.JSONObject;
import com.zakariyya.nextui_backend.util.ResponseEntity;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 全局响应配置
 *
 * @author : wangwenhao
 * @since : 2024/11/22 10:30
 */
@RestControllerAdvice
public class GlobalResponseAdvisor implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof String) {
            return JSONObject.toJSONString(body);
        }else if (body instanceof ResponseEntity) {
            return body;
        }else{
            return ResponseEntity.OK(body);
        }
    }
}
