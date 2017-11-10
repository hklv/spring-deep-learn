package com.lhk.AOP;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 10:29
 */
public class TestForumService {
    public static void main(String[] args){
        ForumService forumService = new ForumServiceImpl();
        forumService.removeForum(100);
        forumService.removeTopic(1203);
    }
}
