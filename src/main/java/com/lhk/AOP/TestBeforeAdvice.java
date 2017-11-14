package com.lhk.AOP;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 14:01
 */
public class TestBeforeAdvice {
    public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        AfterReturningAdvice afterAdvice = new GreetingAfterAdvice();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvice(advice);
        pf.addAdvice(afterAdvice);
        Waiter waiter = (Waiter) pf.getProxy();
        waiter.greetTo("John");
        waiter.serveTo("Tom");
    }
}
