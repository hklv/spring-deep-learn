package com.lhk.AOP.annotation;

import com.lhk.AOP.Waiter;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/13 15:09
 */
public class NaiveWaiter implements Waiter {

    public void greetTo(String name) {
        System.out.println("naive waiter greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("naive waiter serve to " + name);
    }
}
