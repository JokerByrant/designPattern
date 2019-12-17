package com.sxh.newfolder.DP10_代理模式.Dp_10.NP非代理;

import com.sxh.newfolder.DP10_代理模式.Dp_10.service.CommodityService;

/**
 * 用户自己去超市取东西
 * @author 一池春水倾半城
 * @date 2019/12/17 22:07
 */
public class UserOwn implements CommodityService {

    @Override
    public void getCommodity(String name) {
        goSuperMarket();
        chooseCommodity();
        pay();
        System.out.println("用户获得商品：" + name);
        goHome();
    }

    private void goSuperMarket() {
        System.out.println("去超市");
    }

    private void chooseCommodity() {
        System.out.println("选商品");
    }

    private void pay() {
        System.out.println("付钱");
    }

    private void goHome() {
        System.out.println("买完，自己拎回家");
    }
}
