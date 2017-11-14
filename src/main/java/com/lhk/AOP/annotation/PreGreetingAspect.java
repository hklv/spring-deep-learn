package com.lhk.AOP.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/13 15:15
 */
@Aspect
public class PreGreetingAspect {
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("How are you");
    }
}
