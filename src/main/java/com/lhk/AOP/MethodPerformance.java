package com.lhk.AOP;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 9:50
 */
public class MethodPerformance {
    private Long begin;
    private Long end;
    private String serviceMethod;

    public MethodPerformance(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance() {
        end = System.currentTimeMillis();
        Long elapse = end - begin;
        System.out.println(serviceMethod + "花费" + elapse + "毫秒");
    }
}
