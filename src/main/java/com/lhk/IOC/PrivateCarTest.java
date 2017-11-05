package com.lhk.IOC;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/5 20:33
 */
public class PrivateCarTest {
    public static void main(String[] args) throws Throwable {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.lhk.IOC.PrivateCar");
        PrivateCar car = (PrivateCar) clazz.newInstance();
        Field colorField = clazz.getDeclaredField("color");
        colorField.setAccessible(true);
        colorField.set(car, "红色");
        Method driveMethod = clazz.getDeclaredMethod("drive", (Class[]) null);
        driveMethod.setAccessible(true);
        driveMethod.invoke(car, (Object[]) null);
    }
}
