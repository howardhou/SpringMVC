package com.rongzi.controller;

import com.rongzi.entity.Formatter;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormatterController {
    private static final Log logger = LogFactory.getLog(FormatterController.class);

    @RequestMapping("/testFormatter")
    public String index(){
        return "formatterForm1";
    }

    @RequestMapping("/formatter")
    public String test(@ModelAttribute("formatter") Formatter formatter){
        logger.info(formatter);

        return "formatterForm2";
    }
}
