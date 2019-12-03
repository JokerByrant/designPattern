package com.sxh.newfolder.DP2_抽象工厂.Jacket;

import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyJacket;

/**
 * 森马外套
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class SemirJacket implements BuyJacket{
    @Override
    public void buyJacket(int size, String color) {
        System.out.println("森马外套 -- 尺码：" + size + "，颜色：" + color);
    }
}
