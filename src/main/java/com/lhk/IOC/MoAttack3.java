package com.lhk.IOC;

/**
 * @Author: HuiKang Lv
 * @Description:
 * @Date: create at 2017/11/4 22:42
 */
public class MoAttack3 {
    private Geli geli;

    public void SetGeli(Geli geli) {
        this.geli = geli;
    }

    public void cityGateAsk() {
        geli.responseAsk("墨者革离");
    }
}
