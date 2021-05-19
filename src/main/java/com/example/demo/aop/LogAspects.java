package com.example.demo.aop;

/**
 * @program: demo
 * @create: 2021-05-16
 **/
public class LogAspects {

    public void logStart(){
        System.out.println("除法运行。。。");
    }

    public void logEnd(){
        System.out.println("除法结束。。。");
    }
}
