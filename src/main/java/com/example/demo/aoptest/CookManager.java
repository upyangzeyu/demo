package com.example.demo.aoptest;

/**
 * @program: demo
 * @create: 2021-05-24
 **/
public class CookManager implements ICook{
    @Override
    public void dealWithFood() {
        System.out.println("food had been dealed with");
    }

    @Override
    public void cook() {
        System.out.println("cook food");
    }
}
