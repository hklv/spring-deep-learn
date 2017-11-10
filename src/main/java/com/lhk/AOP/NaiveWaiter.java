package com.lhk.AOP;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 13:52
 */
public class NaiveWaiter implements Waiter {
    public void greedTo(String name) {
        System.out.println("greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }
}
