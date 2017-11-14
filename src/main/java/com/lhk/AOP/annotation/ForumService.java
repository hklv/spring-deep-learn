package com.lhk.AOP.annotation;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/14 21:44
 */
public class ForumService {
    @NeedTest(true)
    public void deleteForum(int forumId) {
        System.out.println("删除论坛模块：" + forumId);
    }

    @NeedTest(false)
    public void deleteTopic(int topicId) {
        System.out.println("删除主题：" + topicId);
    }
}
