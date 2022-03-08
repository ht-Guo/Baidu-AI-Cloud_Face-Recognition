package com.sykj.edu.controller;

import com.sykj.edu.util.MyThread;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


public class XTYJServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        MyThread thread = new MyThread();
        thread.start();
    }


}
