package com.rongzi.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user4")
public class User4Controller {

    private static final Log logger = LogFactory.getLog(User2Controller.class);

    @RequestMapping("/{formName}")
    public String registerForm(@PathVariable String formName){
        logger.info("Call registerForm");
        return formName;
    }

    // http://localhost:8080/user4/register
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("user2") User user){
        logger.info("POST register");

        // @ModelAttribute("user2") 注解的功能与 model.addAttribute("user2", user); 类似
        // model.addAttribute("user2", user);
        return "success";
    }
}
