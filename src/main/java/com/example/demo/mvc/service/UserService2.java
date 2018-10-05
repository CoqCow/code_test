package com.example.demo.mvc.service;

import com.example.demo.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService2 {
    @Autowired
    private User user;

    public void print(){
        System.out.println(user.toString()+"]]]");
    }
}
