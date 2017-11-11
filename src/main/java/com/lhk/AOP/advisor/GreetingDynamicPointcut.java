package com.lhk.AOP.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/11 13:49
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClientList = new ArrayList<String>();

    {
        specialClientList.add("John");
        specialClientList.add("John");
    }

    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            public boolean matches(Class<?> clazz) {
                System.out.println("调用getClassFilter()对" + clazz.getName() + "做静态检查");

                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    public boolean matches(Method method, Class clazz) {
        System.out.println("调用matches(method,clazz)" + clazz.getName() + "." + method.getName() + "做静态检查");
        return "greetTo".equals(method.getName());
    }

    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        System.out.println("调用matches(method,class)" + targetClass.getName() + "." + method.getName() + "做静态检查");
        String clientName = (String) args[0];
        return specialClientList.contains(clientName);
    }
}
