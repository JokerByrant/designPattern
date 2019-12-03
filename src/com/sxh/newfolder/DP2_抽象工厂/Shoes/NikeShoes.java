package com.sxh.newfolder.DP2_抽象工厂.Shoes;

import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyShoes;

/**
 * 耐克鞋子
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class NikeShoes implements BuyShoes {
    @Override
    public void buyShoes(int size, String color) {
        System.out.println("耐克鞋子 -- 尺码：" + size + "，颜色：" + color);
    }
}
