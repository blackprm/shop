package com.team.shop.exceptionHandler;

import com.alibaba.fastjson.JSONObject;
import com.team.shop.exception.NoTokenException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 为拦截器中出现的异常定制的异常处理类
 */
@ControllerAdvice
@ResponseBody
public class RuntimeErrorExcrptionHandler {


    @ExceptionHandler(NoTokenException.class)
    public Map<String,Object> handlerRuntimeExcaption(Exception e){
        Map<String,Object> jsonObject = new JSONObject();
        jsonObject.put("code",-1);
        jsonObject.put("message",e.getMessage());
        return jsonObject;

    }
}
