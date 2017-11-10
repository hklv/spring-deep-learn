package com.lhk.IOC;

import org.springframework.context.ApplicationListener;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/9 22:04
 */
public class MailSendListener implements ApplicationListener<MailSendEvent> {
    public void onApplicationEvent(MailSendEvent event) {
        MailSendEvent mse = event;
        System.out.println("MailSendListener:向" + mse.getTo() + "发送完一封邮件");
    }
}
