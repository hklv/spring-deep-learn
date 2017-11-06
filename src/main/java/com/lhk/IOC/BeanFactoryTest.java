package com.lhk.IOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/5 21:49
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:com.lhk.IoC/beans.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        System.out.println("init BeanFactory");
        Car car = bf.getBean("car", Car.class);
        System.out.println("car bean is already use");
    }
}
