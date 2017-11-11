package com.lhk.AOP.advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 15:29
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "." + method.getName());
        String clientName = (String) objects[0];
        System.out.println("How are you Mr." + clientName);
    }
}
