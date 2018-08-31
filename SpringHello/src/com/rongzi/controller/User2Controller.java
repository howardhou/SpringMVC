package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/user2")
public class User2Controller {

    private static List<User> userList;
    private static final Log logger = LogFactory.getLog(User2Controller.class);

    public User2Controller(){
        super();
        userList = new ArrayList<User>();
    }

    // http://localhost:8080/user2/register
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm(){
        logger.info("GET registerForm");
        return "registerForm";
    }

    // for register button
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("loginname") String loginname,
                           @RequestParam("password") String password,
                           @RequestParam("username") String username){

        logger.info("POST register");

        Random random = new Random();

        User user = new User();
        user.setUserid(random.nextInt(1000));
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);

        userList.add(user);

        return "loginForm";
    }

    // for login
    // GET http://localhost:8080/user2/login?loginname=howard&password=123456
    @RequestMapping(value = "/login")
    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password,
                        Model model){
        logger.info(" login");
        for (User user : userList){
            if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)){
                model.addAttribute("user", user);
                return "welcome";
            }
        }
        return "loginForm";
    }

}
