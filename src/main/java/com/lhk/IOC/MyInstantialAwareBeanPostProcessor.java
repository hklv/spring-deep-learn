package com.lhk.IOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/6 16:44
 */
public class MyInstantialAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
        if ("carLifeCycle".equals(beanName)) {
            System.out.println("InstantiationAwareBeanPostProcessor");
        }
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) {
        if ("carLifeCycle".equals(beanName)) {
            System.out.println("InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation()");
        }
        return true;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) {
        if ("carLifeCycle".equals(beanName)) {
            System.out.println("调用InstantiationAwareBeanPostProcessor.postProcessPropertyValues()");
        }
        return pvs;
    }
}
