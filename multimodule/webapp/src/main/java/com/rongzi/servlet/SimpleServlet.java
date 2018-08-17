package com.rongzi.servlet;

import com.rongzi.service.SimpleService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String desc = SimpleService.getDscription();

        PrintWriter out = response.getWriter();

        out.println(desc);
        out.flush();
        out.close();
    }
}

