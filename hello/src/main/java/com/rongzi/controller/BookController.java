package com.rongzi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/json")
public class BookController {

    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping(value = "/testRequestBody")
    public void setJson(@RequestBody Book book, HttpServletResponse response) throws Exception {

        logger.info("================");

        ObjectMapper mapper = new ObjectMapper();

        logger.info(mapper.writeValueAsString(book));

        book.setAuthor("侯冬冬");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(book));
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "index";
    }
}