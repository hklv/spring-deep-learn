package com.lhk.AOP;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 14:12
 */
public class GreetingInterceptor implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        String clientName = (String) args[0];
        System.out.println("How are you Mr." + clientName);
        Object obj = methodInvocation.proceed();
        System.out.println("Please enjoy yourself!");
        return obj;
    }
}
