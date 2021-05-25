package com.example.demo.tx;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: demo
 * @create: 2021-05-12
 **/
public class TxTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser2();
        applicationContext.close();

    }
}
