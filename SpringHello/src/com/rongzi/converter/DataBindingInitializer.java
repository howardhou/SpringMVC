package com.rongzi.converter;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

public class DataBindingInitializer implements WebBindingInitializer {
    @Override
    public void initBinder(WebDataBinder webDataBinder, WebRequest webRequest) {
        //注册自定义编辑器
        webDataBinder.registerCustomEditor(Date.class, new DateEditor());
    }
}
