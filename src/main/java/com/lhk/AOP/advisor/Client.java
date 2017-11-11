package com.lhk.AOP.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/11 13:04
 */
public class Client {
    public static void main(String[] args) {
        String configPath = "D:/project/spring/spring-learn/src/main/resources/com.lhk.IoC/beans.xml";
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(configPath);
        Waiter waiter = (Waiter) applicationContext.getBean("waiter");
        Seller seller = (Seller) applicationContext.getBean("seller");
        waiter.greetTo("John");
        waiter.serveTo("John");
        seller.greetTo("John");
        /*Waiter waiter1 = (Waiter) applicationContext.getBean("waiter1");
        waiter1.greetTo("John");
        waiter1.serveTo("John");*/
    }
}
