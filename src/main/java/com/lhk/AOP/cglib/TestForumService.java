package com.lhk.AOP.cglib;


import com.lhk.AOP.jdk.ForumServiceImpl;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 11:20
 */
public class TestForumService {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1012);
    }
}
