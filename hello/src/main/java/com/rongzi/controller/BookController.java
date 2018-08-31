package com.rongzi.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/json")
public class BookController {

    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping(value = "/testRequestBody")
    public void setJson(@RequestBody Book book, HttpServletResponse response) throws Exception {

        logger.info("======== setJson ========");

        ObjectMapper mapper = new ObjectMapper();

        logger.info(mapper.writeValueAsString(book));

        book.setAuthor("侯冬冬");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(book));
    }

    @RequestMapping(value = "/testRequestBody2")
    public void setJson2(@RequestBody Book book, HttpServletResponse response) throws Exception {

        logger.info("======== setJson2 ========");

        logger.info(JSONObject.toJSONString(book));

        book.setAuthor("侯冬冬");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(JSONObject.toJSONString(book));
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "index";
    }

    @RequestMapping(value = "/testResponseBody")
    @ResponseBody public Object getJson() {

        logger.info("========= getJson =======");

        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1, "Spring MVC 应用实战", "侯冬冬"));
        list.add(new Book(2,"Spring Cloud 实战", "李刚"));
        return list;
    }

}