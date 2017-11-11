package com.lhk.AOP.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 15:24
 */
public class GeetingAdvisor extends StaticMethodMatcherPointcutAdvisor {
    public boolean matches(Method method, Class<?> aClass) {
        return "greetTo".equals(method.getName());
    }

    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            public boolean matches(Class<?> aClass) {
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }

}
