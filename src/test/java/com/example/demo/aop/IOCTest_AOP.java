package com.example.demo.aop;

import com.example.demo.config.MainConfigOfAOP;
import com.example.demo.tx.TxConfig;
import com.example.demo.tx.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: demo
 * @create: 2021-05-12
 **/
public class IOCTest_AOP {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1, 1);

        applicationContext.close();

    }
}
