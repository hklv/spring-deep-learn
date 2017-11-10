package com.lhk.AOP;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 13:53
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String clientName = (String) objects[0];
        System.out.println("How are you! Mr." + clientName);
    }
}
