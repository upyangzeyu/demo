package com.example.demo.config;

import com.example.demo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo
 * @create: 2021-05-13
 **/

//配置类==配置文件
@Configuration
public class MainConfig {

    //给容器中注册一个Bean，类型为返回值的类型，id默认是用方法名作为id
    @Bean
    public Person person(){
        return new Person("lisi", 20);
    }
}

