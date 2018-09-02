package com.rongzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class Register2Controller {

    //Model 属性名称和值有 model.addAttribute 实现，需要在方法中加入 Model 参数
    @ModelAttribute
    public void userModel(@RequestParam("loginname") String loginname,
                           @RequestParam("password") String password,
                           Model model){
        model.addAttribute("loginname", loginname);
        model.addAttribute("password", password);
    }

    @RequestMapping("/register2")
    public String register(){
        return "result";
    }
}
