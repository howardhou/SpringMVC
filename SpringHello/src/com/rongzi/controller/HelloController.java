package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

    private static final Log logger = LogFactory.getLog(HelloController.class);

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handleRequest 被调用");

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World!");
        mv.setViewName("welcome.jsp");
        return mv;
    }
}
