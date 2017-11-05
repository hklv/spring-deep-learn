package com.lhk.IOC;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/4 22:38
 */
public class MoAttack2 {
    private Geli geli;

    public MoAttack2(Geli geli) {
        this.geli = geli;
    }

    public void cityGateAsk() {
        geli.responseAsk("墨者革离");
    }
}
