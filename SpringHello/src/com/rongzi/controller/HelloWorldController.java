package com.rongzi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    //http://localhost:8080/helloworld
    @RequestMapping(value="/helloworld")
    public String hello(Model model) {
        System.out.println("hello world");
        model.addAttribute("message", "Hello World ... ");
        return "helloworld";
    }

}
