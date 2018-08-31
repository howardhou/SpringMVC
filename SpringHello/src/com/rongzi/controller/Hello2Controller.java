package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello2Controller {
    private static final Log logger = LogFactory.getLog(Hello2Controller.class);

    // http://localhost:8080/hello2
    @RequestMapping("/hello2")
    public ModelAndView hello(){
        logger.info("Hello 方法 被调用了");

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World! 2222");
        mv.setViewName("welcome");
        return mv;
    }
}
