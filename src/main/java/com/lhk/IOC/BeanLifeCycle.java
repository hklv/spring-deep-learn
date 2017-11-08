package com.lhk.IOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/8 14:28
 */
public class BeanLifeCycle {
    private static void LifeCycleBeanFactory() {
        Resource resource = new FileSystemResource("D:/project/spring/spring-learn/src/main/resources/com.lhk.IoC/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        ((ConfigurableBeanFactory) beanFactory).addBeanPostProcessor(new MyBeanPostProcessor());
        ((ConfigurableBeanFactory) beanFactory).addBeanPostProcessor(new MyInstantialAwareBeanPostProcessor());
        CarLifeCycle car = (CarLifeCycle) beanFactory.getBean("car");
        car.introduce();
        car.setColor("红色");
        CarLifeCycle car2 = (CarLifeCycle) beanFactory.getBean("car");
        System.out.println("car == car2: " + (car == car2));
        ((XmlBeanFactory) beanFactory).destroySingletons();
    }

    public static void main(String[] args) {
        LifeCycleBeanFactory();
    }
}
