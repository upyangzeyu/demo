package com.example.demo.aoptest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: demo
 * @create: 2021-05-24
 **/
public class DynamicProxyHandler implements InvocationHandler {
    Object obj;

    public DynamicProxyHandler(ICook obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke start");
        System.out.println(method.getName());
        method.invoke(obj, args);
        System.out.println("invoke end");
        return null;
    }
}
