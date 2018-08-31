package com.rongzi.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
@RequestMapping("/user")
public class UserController {

    // http://localhost:8080/user/register
    @RequestMapping("/register")
    public String register(){

        Random random = new Random();

        int sss = random.nextInt(1000);

        return "register";
    }

    // http://localhost:8080/user/login
    @RequestMapping("/login")
    public String login(){
        return "index";
    }

    // http://localhost:8080/user/login2
    // 参数 Model , ModelMap , ModelAndView
    @RequestMapping("/login2")
    public String login2(Model model){

        model.addAttribute("username", "Hou Dongdong 222");
        return "index";
    }

    // http://localhost:8080/user/login3
    @RequestMapping("/login3")
    public String login3(ModelMap mm){

        mm.addAttribute("username", "Hou Dongdong 333");
        return "index";
    }

    // http://localhost:8080/user/login4
    @RequestMapping("/login4")
    public ModelAndView login5(ModelAndView mv){

        mv.setViewName("index");
        mv.addObject("username", "Hou Dongdong 444");
        return mv;
    }

}
