package com.example.demo.aop;

import org.aspectj.lang.annotation.*;

/**
 * 切面类
 *
 * @Aspect:告诉当前类是一个切面类
 *
 *
 *
 * @program: demo
 * @create: 2021-05-16
 **/

@Aspect
public class LogAspects {

    //抽取公共的切入点表达式
    //1。本类引用
    //2。其他的切面引用
    @Pointcut("execution(public int com.example.demo.aop.MathCalculator.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void logStart(){
        System.out.println("除法运行。。。参数列表是： {}");
    }

    @After("com.example.demo.aop.LogAspects.pointCut()")
    public void logEnd(){
        System.out.println("除法结束。。。");
    }

    @AfterReturning("pointCut()")
    public void logReturn(){
        System.out.println("除法正常返回。。。运行结果：{}");
    }

    @AfterThrowing("pointCut()")
    public void logException(){
        System.out.println("除法异常。。。异常信息：{}");
    }
}
