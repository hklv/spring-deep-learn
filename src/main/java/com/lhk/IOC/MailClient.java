package com.lhk.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/9 22:10
 */
public class MailClient {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:/project/spring/spring-learn/src/main/resources/com.lhk.IoC/beans.xml");
        MailSender mailSender = (MailSender) ctx.getBean("mailSender");
        mailSender.sendMail("1332280198@qq.com");
    }
}
