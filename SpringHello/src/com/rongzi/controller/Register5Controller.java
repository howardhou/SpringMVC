package com.rongzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class Register5Controller {

    // 此方法的返回值不是一个视图，而是 Model 属性的值，Model名称是username
    // 视图名称由 @RequestMapping 的 value值决定
    @RequestMapping(value = "/register5")
    public String register(@ModelAttribute("user") User user)
    {
        user.setUsername("管理员");
        return "result";
    }
}
