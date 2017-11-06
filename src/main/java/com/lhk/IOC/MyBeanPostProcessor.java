package com.lhk.IOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/6 17:57
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return null;
    }
}
