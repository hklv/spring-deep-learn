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
        if (s.equals("car")) {
            CarLifeCycle car = (CarLifeCycle) o;
            if (car.getColor() == null) {
                System.out.println("调用BeanPost.postProcessBeforeInitialization,颜色为空，设置为黑色");
                car.setColor("黑色");
            }
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if (s.equals("car")) {
            CarLifeCycle car = (CarLifeCycle) o;
            if (car.getMaxSpeed() > 200) {
                System.out.println("调用BeanProcessAfterInitialization,速度大于200，将速度调整为200");
            }
            car.setMaxSpeed(200);

        }
        return o;
    }
}
