package com.rongzi.controller;

import com.rongzi.entity.User;
import com.rongzi.validator.UserValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user5")
public class User5Controller {

    private static final Log logger = LogFactory.getLog(User5Controller.class);

    // 注入 UserValidator 对象
    @Autowired
    @Qualifier("userValidator")
    private UserValidator userValidator;

    @RequestMapping("/loginForm")
    public String loginForm(@ModelAttribute("user") User user){
        logger.info("Call loginForm");

        return "loginForm4";
    }

    // http://localhost:8080/user5/login
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, Errors errors){
        logger.info(user);

        // 调用 userValidator 的验证方法
        userValidator.validate(user,errors);
        // 验证不通过 打开 loginForm4 页面
        if (errors.hasErrors()){
            return "loginForm4";
        }
        else {
            user.setUsername("Test");
            user.setSex("男");
            return "userInfo";
        }
    }
}
