package com.example.demo.controller.advice;

import com.alibaba.fastjson.JSONObject;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author wangzhijun
 * @create 2018-10-09 10:20
 * @description
 */
@ControllerAdvice
public class RestResponseBody implements ResponseBodyAdvice{
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        System.out.println("methodParameter = [" + methodParameter.toString()+ "], aClass = [" + aClass.toString() + "]");
        System.out.println("RestResponseBody"+111);
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        System.out.println("o = [" + o.toString() + "], methodParameter = [" + methodParameter.toString() + "], mediaType = [" + mediaType.toString() + "], aClass = [" + aClass.toString() + "], serverHttpRequest = [" + serverHttpRequest.toString() + "], serverHttpResponse = [" + serverHttpResponse.toString() + "]");
        System.out.println("RestResponseBody"+222);
        return o;
    }
}
