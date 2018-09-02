package com.rongzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class Register4Controller {

    // 此方法的返回值不是一个视图，而是 Model 属性的值，Model名称是username
    // 视图名称由 @RequestMapping 的 value值决定
    @RequestMapping(value = "/register4")
    @ModelAttribute(value = "username")
    public String register(){
        return "admin";
    }
}
