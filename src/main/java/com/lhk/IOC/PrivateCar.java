package com.lhk.IOC;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/5 20:34
 */
public class PrivateCar {
    private String color;

    protected void drive() {
        System.out.println("drive private car!the color is:" + color);
    }
}
