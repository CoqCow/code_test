package com.example.demo.proxy;

public interface Target {
    int a=1;
    int test(int i);

    public static String tesd(){
        return "fdsaf";
    }
    default int al(){
        return 2;
    }
}
