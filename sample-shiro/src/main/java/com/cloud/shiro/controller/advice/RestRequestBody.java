package com.cloud.shiro.controller.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author wangzhijun
 * @create 2018-10-09 10:04
 * @description
 */
@ControllerAdvice
public class RestRequestBody implements RequestBodyAdvice {//都在请求到controller之前执行
    //首先判断是否支持
    @Override
    public boolean supports(MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        System.out.println("methodParameter = [" + methodParameter.toString() + "], type = [" + type.toString() + "], aClass = [" + aClass.toString() + "]");
        System.out.println("RestRequestBody"+111);
        return true;
    }
    //执行前判断是否支持
    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) throws IOException {
        System.out.println("httpInputMessage = [" + httpInputMessage.toString() + "], methodParameter = [" + methodParameter.toString() + "], type = [" + type.toString() + "], aClass = [" + aClass.toString() + "]");
        System.out.println("RestRequestBody"+222);
        return httpInputMessage;
    }
    //执行前判断是否支持
    @Override
    public Object afterBodyRead(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        System.out.println("o = [" + o.toString() + "], httpInputMessage = [" + httpInputMessage.toString() + "], methodParameter = [" + methodParameter.toString() + "], type = [" + type.toString() + "], aClass = [" + aClass.toString() + "]");
        System.out.println("RestRequestBody"+333);
        return o;
    }

    @Override
    public Object handleEmptyBody(Object o, HttpInputMessage httpInputMessage, MethodParameter methodParameter, Type type, Class<? extends HttpMessageConverter<?>> aClass) {
        System.out.println("o = [" + o.toString() + "], httpInputMessage = [" + httpInputMessage.toString() + "], methodParameter = [" + methodParameter.toString() + "], type = [" + type.toString() + "], aClass = [" + aClass.toString() + "]");
        System.out.println("RestRequestBody"+444);
        return o;
    }
}
