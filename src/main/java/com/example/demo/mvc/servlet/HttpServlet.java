package com.example.demo.mvc.servlet;

public class HttpServlet {

    public void service(String s){
        this.deGet(s);
    }
    public void deGet(String s){
        System.out.println("HttpServlet:"+s);
    }
}
