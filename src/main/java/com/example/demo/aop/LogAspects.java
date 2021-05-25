package com.example.demo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * 切面类
 *
 * @Aspect:告诉当前类是一个切面类
 * @program: demo
 * @create: 2021-05-16
 **/

@Aspect
public class LogAspects {

    //抽取公共的切入点表达式
    //1。本类引用
    //2。其他的切面引用

    /**注： JoinPoint必须出现在参数表第一位*/
    @Pointcut("execution(public int com.example.demo.aop.MathCalculator.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("" + joinPoint.getSignature().getName() + "运行。。。参数列表是： {" + Arrays.asList(args) + "}");
    }

    @After("com.example.demo.aop.LogAspects.pointCut()")
    public void logEnd() {
        System.out.println("除法结束。。。");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法正常返回。。。运行结果：{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常。。。异常信息：{}");
    }
}
