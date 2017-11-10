package com.lhk.AOP.jdk;

import com.lhk.AOP.ForumService;

import java.lang.reflect.Proxy;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 10:45
 */
public class TestForumService {
    public static void main(String[] args) {
        ForumService target = new ForumServiceImpl();
        PerformanceHandler performanceHandler = new PerformanceHandler(target);
        ForumService proxy = (ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), performanceHandler);
        proxy.removeTopic(10);
        proxy.removeForum(1012);
    }
}
