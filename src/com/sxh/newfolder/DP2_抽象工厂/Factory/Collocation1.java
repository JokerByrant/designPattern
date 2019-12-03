package com.sxh.newfolder.DP2_抽象工厂.Factory;

import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyJacket;
import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyShoes;
import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyWinterClothes;
import com.sxh.newfolder.DP2_抽象工厂.Jacket.SemirJacket;
import com.sxh.newfolder.DP2_抽象工厂.Shoes.NikeShoes;

/**
 * 第一套穿搭，森马的夹克和耐克的鞋子
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class Collocation1 implements BuyWinterClothes{
    @Override
    public BuyJacket createJacket() {
        return new SemirJacket();
    }

    @Override
    public BuyShoes createShoes() {
        return new NikeShoes();
    }
}
