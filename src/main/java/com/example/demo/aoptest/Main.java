package com.example.demo.aoptest;

import java.lang.reflect.Proxy;

/**
 * @program: demo
 * @create: 2021-05-24
 **/
public class Main {
    public static void main(String[] args) {
        CookManager cookManager = new CookManager();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(cookManager);
        ICook iCook =(ICook) Proxy.newProxyInstance(dynamicProxyHandler.getClass().getClassLoader(),cookManager.getClass().getInterfaces(), dynamicProxyHandler);
        //打印一下代理类的类名
        System.out.println(iCook.getClass().getName());
        iCook.dealWithFood();
        iCook.cook();
    }
}
