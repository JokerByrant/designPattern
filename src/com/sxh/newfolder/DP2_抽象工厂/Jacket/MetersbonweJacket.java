package com.sxh.newfolder.DP2_抽象工厂.Jacket;

import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyJacket;

/**
 * 美特斯邦威外套
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class MetersbonweJacket implements BuyJacket {
    @Override
    public void buyJacket(int size, String color) {
        System.out.println("美特斯邦威外套 -- 尺码：" + size + "，颜色：" + color);
    }
}
