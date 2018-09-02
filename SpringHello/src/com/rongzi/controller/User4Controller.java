package com.rongzi.controller;

import com.rongzi.converter.DateEditor;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    // 在控制器初始化时注册 属性编辑器
//    @InitBinder
//    public void initBinder(WebDataBinder binder){
//        //注册自定义编辑器， 将Date类型使用 DateEditor 类进行转换
//        binder.registerCustomEditor(Date.class, new DateEditor());
//    }
}
