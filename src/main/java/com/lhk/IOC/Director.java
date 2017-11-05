package com.lhk.IOC;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/4 22:39
 */
public class Director {
    public void direct() {
        Geli geli = new LiuDeHua1();
        MoAttack2 moAttack2 = new MoAttack2(geli);
        moAttack2.cityGateAsk();
    }
}
