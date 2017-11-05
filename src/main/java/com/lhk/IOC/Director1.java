package com.lhk.IOC;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/4 22:41
 */
public class Director1 {
    public void direct() {
        Geli geli = new LiuDeHua1();
        MoAttack3 moAttack3 = new MoAttack3();
        moAttack3.SetGeli(geli);
        moAttack3.cityGateAsk();
    }
}
