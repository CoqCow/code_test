package com.example.demo.mvc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserService1Test {
    @Autowired
    private UserService1 userService1;

    @Autowired
    private UserService2 userService2;

    @Test
    public void test(){
        userService1.setUser();
        userService2.print();
    }
}