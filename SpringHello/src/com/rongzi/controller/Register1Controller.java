package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class Register1Controller {

    private static final Log logger = LogFactory.getLog(User2Controller.class);

    //Model属性的名称是 loginname
    @ModelAttribute("loginname")
    public String userModel1(@RequestParam("loginname") String loginname){
        return loginname;
    }

    @RequestMapping("/register1")
    public String register1(){
        return "result";
    }
}
