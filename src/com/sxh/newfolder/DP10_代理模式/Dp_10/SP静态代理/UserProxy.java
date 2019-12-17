package com.sxh.newfolder.DP10_代理模式.Dp_10.SP静态代理;

import com.sxh.newfolder.DP10_代理模式.Dp_10.service.CommodityService;
import com.sxh.newfolder.DP10_代理模式.Dp_10.service.impl.UserImpl;

/**
 * 用户代理类 === 静态代理
 * @author 一池春水倾半城
 * @date 2019/12/17 22:14
 */
public class UserProxy implements CommodityService {
    private UserImpl user;

    public UserProxy() {
        user = new UserImpl();
    }

    @Override
    public void getCommodity(String name) {
        System.out.println("我是UU跑腿的工作人员，我去超市帮助用户取商品：" + name);
        user.getCommodity(name);
        System.out.println("用户拿到货了，如果满意请给好评哦");
    }
}
