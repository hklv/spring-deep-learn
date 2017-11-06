package com.lhk.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/6 13:42
 */
public class AnnotationApplicationContext {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        Car car = ctx.getBean("car", Car.class);
        car.introduce();
    }
}
