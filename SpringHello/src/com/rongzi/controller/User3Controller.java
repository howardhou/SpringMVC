package com.rongzi.controller;

import com.rongzi.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user3")
public class User3Controller {

    private static final Log logger = LogFactory.getLog(User3Controller.class);

    // http://localhost:8080/user3/info
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String userInfo(Model model, HttpServletRequest request){
        logger.info("GET userInfo");

        // 每次请求都一样
        System.out.println(this);

        // 获取 Spring容器 - ApplicationContext
        WebApplicationContext applicationContext = (WebApplicationContext) request.getAttribute(DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
//        User user = new User();

        user.setUsername("侯冬冬");
        user.setSex("男");
        user.setAge(36);

        model.addAttribute("user", user);
        return "userInfo";
    }
}
