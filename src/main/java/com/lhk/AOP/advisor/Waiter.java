package com.lhk.AOP.advisor;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 15:20
 */
public class Waiter {
    public void greetTo(String name) {
        System.out.println("waiter greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("waite to " + name);
    }
}
