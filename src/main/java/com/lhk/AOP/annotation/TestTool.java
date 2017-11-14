package com.lhk.AOP.annotation;

import java.lang.reflect.Method;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/14 21:47
 */
public class TestTool {
    public static void main(String[] args) {
        Class clazz = ForumService.class;
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods) {
            NeedTest nt = method.getAnnotation(NeedTest.class);
            if (nt != null) {
                if (nt.value()) {
                    System.out.println("需要测试");
                } else {
                    System.out.println("不需要测试");
                }
            }
        }
    }
}
