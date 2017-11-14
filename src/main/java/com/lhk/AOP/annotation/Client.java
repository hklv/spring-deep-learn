package com.lhk.AOP.annotation;

import com.lhk.AOP.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/13 15:29
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:/project/spring/spring-learn/src/main/resources/com.lhk.IoC/beans.xml");
        Waiter waiter = (Waiter) applicationContext.getBean("waiter2");
        waiter.greetTo("John");
        waiter.serveTo("John");
    }
}
