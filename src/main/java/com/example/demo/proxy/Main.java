package com.example.demo.proxy;

public class Main {
    public static void main(String[] args) {
        Target target = new JdkDynamicProxyTest().newProxyInstance(new TargetImpl());
        System.out.println(target.test(4));
        System.out.println("------------------");
        TargetImpl target1 = (TargetImpl) new CglibProxyTest().createProxyObject(new TargetImpl());
        System.out.println(target1.test(6));
    }
}
