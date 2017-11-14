package com.lhk.AOP.annotation;

import com.lhk.AOP.Waiter;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/13 15:22
 */
public class AspectJProxyTest {
    Waiter target = new NaiveWaiter();
    AspectJProxyFactory factory = new AspectJProxyFactory();
}
