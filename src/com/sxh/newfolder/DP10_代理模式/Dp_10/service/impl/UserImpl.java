package com.sxh.newfolder.DP10_代理模式.Dp_10.service.impl;

import com.sxh.newfolder.DP10_代理模式.Dp_10.service.CommodityService;

/**
 * 用户去买东西
 * @author 一池春水倾半城
 * @date 2019/12/17 22:12
 */
public class UserImpl implements CommodityService {
    @Override
    public void getCommodity(String name) {
        System.out.println("用户获得商品：" + name);
    }
}
