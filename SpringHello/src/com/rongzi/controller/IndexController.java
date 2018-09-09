package com.rongzi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private static final Log logger = LogFactory.getLog(IndexController.class);

    @RequestMapping("/{formName}")
    public String registerForm(@PathVariable String formName){
        logger.info("Call registerForm");
        return formName;
    }

}
