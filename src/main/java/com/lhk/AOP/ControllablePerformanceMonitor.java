package com.lhk.AOP;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/10 14:40
 */
public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable {

    private ThreadLocal<Boolean> monitorStatusMap = new ThreadLocal<Boolean>();

    public void setMonitorActive(boolean active) {
        monitorStatusMap.set(active);
    }

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object obj;
        if (monitorStatusMap.get() != null && monitorStatusMap.get()) {
            PerformanceMonitor.begin(methodInvocation.getClass().getName() + "." + methodInvocation.getMethod().getName());
            obj = super.invoke(methodInvocation);
            PerformanceMonitor.end();
        } else {
            obj = super.invoke(methodInvocation);
        }
        return obj;
    }
}
