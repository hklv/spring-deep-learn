package com.lhk.AOP;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 14:09
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("please enjoy yourself!");
    }
}
