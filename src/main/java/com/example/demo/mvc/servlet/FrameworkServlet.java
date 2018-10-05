package com.example.demo.mvc.servlet;

public class FrameworkServlet extends HttpServlet {

    public void service(){
        super.service("request");
    }

    public void deGet(String s){
        System.out.println("FrameworkServlet:"+s);
    }
}
