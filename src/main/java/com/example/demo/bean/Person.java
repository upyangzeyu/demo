package com.example.demo.bean;

import lombok.Data;

/**
 * @program: demo
 * @create: 2021-05-13
 **/

@Data
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
