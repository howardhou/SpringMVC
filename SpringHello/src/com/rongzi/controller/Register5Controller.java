package com.rongzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class Register5Controller {

    // 表示 参数 user 就是 model 中的属性
    @RequestMapping(value = "/register5")
    public String register(@ModelAttribute("user") User user)
    {
        user.setUsername("管理员");
        return "result";
    }
}
