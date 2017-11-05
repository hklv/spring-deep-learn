package com.lhk.IOC;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/4 22:57
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class clazz = classLoader.loadClass("com.lhk.IOC.Car");
        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) cons.newInstance();
        Method setBrand = clazz.getDeclaredMethod("setBrand", String.class);
        setBrand.invoke(car, "宝马330");
        Method setColor = clazz.getDeclaredMethod("setColor", String.class);
        setColor.invoke(car, "红色");
        Method setMaxSpeed = clazz.getDeclaredMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 300);
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        car.introduce();
    }
}
