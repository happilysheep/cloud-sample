package com.cloud.shiro.controller.advice;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

/**
 * @author wangzhijun
 * @create 2018-10-09 9:45
 * @description
 */
@ControllerAdvice
public class HandlerHttpClientException {

    @ExceptionHandler(HttpClientErrorException.class)
    public Object HandlerHttpClientEx(HttpClientErrorException ex) {
        String responseBodyString = ex.getResponseBodyAsString();
        System.out.println("String responseBodyString = [" + responseBodyString + "]");
        JSONObject responseBody = JSONObject.parseObject(responseBodyString);
        System.out.println("ex = [" + JSONObject.toJSONString(ex) + "]");
        String message = responseBody.getString("error_description");
        if(StringUtils.isBlank(message)) {
            message = responseBody.getString("message");
        }
        responseBody.put("status", ex.getStatusCode().value());
        responseBody.put("message", message);
        return responseBody;
    }

}
