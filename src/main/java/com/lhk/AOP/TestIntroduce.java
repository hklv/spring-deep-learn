package com.lhk.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 14:53
 */
public class TestIntroduce {
    public static void main(String[] args) {
        String configPath = "D:/project/spring/spring-learn/src/main/resources/com.lhk.IoC/beans.xml";
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(configPath);
        ForumService forumService = (ForumService) applicationContext.getBean("forumService");
        forumService.removeForum(10);
        forumService.removeTopic(1012);
        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorActive(true);
        forumService.removeForum(312);
        forumService.removeTopic(789);
    }
}
