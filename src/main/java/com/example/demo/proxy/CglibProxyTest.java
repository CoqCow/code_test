package com.example.demo.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyTest implements MethodInterceptor {
    private Object targetObject;

    public Object createProxyObject(Object obj) {
        this.targetObject = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        return proxyObj;// 返回代理对象
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        checkPopedom();
        Object res = method.invoke(targetObject, objects);
        saveLog();
        return res;
    }

    private void checkPopedom() {//模拟检查权限的例子
        System.out.println(".:检查权限  checkPopedom()!");
    }

    private void saveLog() {
        System.out.println(".:保存操作日志  log saving()!");
    }
}
