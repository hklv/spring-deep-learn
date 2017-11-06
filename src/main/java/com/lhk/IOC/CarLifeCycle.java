package com.lhk.IOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author: HuiKang Lv
 * @Description: 生命周期
 * @Date: create at 2017/11/6 16:30
 */
public class CarLifeCycle implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String color;
    private String brand;
    private int maxSpeed;
    private BeanFactory beanFactory;
    private String beanName;

    public CarLifeCycle() {
        System.out.println("调用CarLifeCycle()的构造函数");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware.setBeanName()");
        this.beanName = s;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet()");
    }

    public void destroy() throws Exception {
        System.out.println("调用Disposable.destroy()");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性");
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void introduce() {
        System.out.println("brand: " + brand + ",color: " + color + ",maxSpeed: " + maxSpeed);
    }

    public void myInit() {
        System.out.println("调用init-method所指定的myInit(),将maxSpeed设置为400");
        this.maxSpeed = 400;
    }

    public void myDestroy() {
        System.out.println("调用init-destroy所指定的myDestroy().");
    }
}
