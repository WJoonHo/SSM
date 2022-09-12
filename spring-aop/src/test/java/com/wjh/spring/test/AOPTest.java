package com.wjh.spring.test;

import com.wjh.spring.aop.annotation.Calculator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：王俊豪 开发时间：2022/9/6 13:49
 */

public class AOPTest {
    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,1);
    }
}
