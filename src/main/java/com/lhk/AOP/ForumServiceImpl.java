package com.lhk.AOP;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 10:16
 */
public class ForumServiceImpl implements ForumService {
    public void removeTopic(int topic) {
        PerformanceMonitor.begin("com.lhk.AOP.ForumServiceImpl.removeTopic()");
        System.out.println("模拟删除Topic记录：" + topic);
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
        PerformanceMonitor.begin("com.lhk.AOP.ForumServiceImpl.removeForum()");
        System.out.println("模拟删除Forum记录：" + forumId);
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        PerformanceMonitor.end();
    }
}
