package com.lhk.IOC;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/5 20:26
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println("Current Loader: " + classLoader);
        System.out.println("parent Loader:" + classLoader.getParent());
        System.out.println("grand parent loader:" + classLoader.getParent().getParent());
    }
}
