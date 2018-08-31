package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
@RequestMapping("/session")
public class SessionAttributesController {
    private static final Log logger = LogFactory.getLog(User2Controller.class);

    @RequestMapping("/{formName}")
    public String loginForm(@PathVariable String formName){
        return formName;
    }

    // http://localhost:8080/session/login?loginname=hello&password=123
    @RequestMapping(value = "/login")
    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password,
                        Model model){
        logger.info(" login");

        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("admin");
        user.setUserid(1);

        model.addAttribute("user", user);

        return "welcome";
    }

}
