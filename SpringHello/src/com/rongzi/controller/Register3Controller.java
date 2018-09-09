package com.rongzi.controller;

import com.rongzi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class Register3Controller {

    public User find(String loginname, String password){
        User user = new User();
        user.setLoginname("admin");
        user.setPassword("123456");
        user.setUsername("管理员");
        user.setSex("男");
        user.setAge(38);
        return user;
    }

    // model 属性的名称没有指定，由返回类型隐含表示。
    // 这里返回 User 对象， 则model的名称就是 user
    @ModelAttribute
    public User userModel(@RequestParam("loginname") String loginname,
                           @RequestParam("password") String password){
        return find(loginname,password);
    }

    @RequestMapping("/register3")
    public String register(){
        return "result";
    }
}
