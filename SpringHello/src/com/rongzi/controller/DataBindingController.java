package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DataBindingController {
    private static final Log logger = LogFactory.getLog(DataBindingController.class);

    // http://localhost:8080/pathVariableTest/23
    @RequestMapping("/pathVariableTest/{userId}")
    public void pathVariableTest(@PathVariable Integer userId){
        logger.info("获取参数： " + userId);
    }

    // http://localhost:8080/requestHeaderTest
    @RequestMapping("/requestHeaderTest")
    public void requestHeaderTest(@RequestHeader("User-Agent") String userAgent,
                                  @RequestHeader("Accept") String[] accepts){

        logger.info("requestHeaderTest 参数： " + userAgent);
        for (String accept: accepts) {
            logger.info(accept);
        }
    }

    // http://localhost:8080/cookieValueTest
    @RequestMapping("/cookieValueTest")
    public void cookieValueTest(@CookieValue(value = "JSSESSIONID" , defaultValue = "") String sessionId){
        logger.info("cookieValueTest 参数 ： " + sessionId);
    }
}
