package com.wjh.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
@author：王俊豪
开发时间：2022/9/5 10:54
*/

@Component
@Aspect  //将当前组件标识为切面
public class LoggerAspect {

//    @Before("execution(public int com.wjh.spring.aop.annotation.CalculatorImpl.add(int,int ))")
    @Before("pointCut()")
    public void beforeAdviceMethod(){
        System.out.println("LoggerAspect,前置通知");
    }
    @Pointcut("execution(public int com.wjh.spring.aop.annotation.CalculatorImpl.add(int,int ))")
    public void pointCut(){}
}
