package com.lhk.AOP.jdk;

import com.lhk.AOP.ForumService;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 10:36
 */
public class ForumServiceImpl implements ForumService {
    public void removeTopic(int topic) {
        System.out.println("模拟删除Topic记录：" + topic);
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void removeForum(int forumId) {
        System.out.println("模拟删除Forum记录：" + forumId);
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
