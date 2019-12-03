package com.sxh.newfolder.DP2_抽象工厂.Factory;

import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyJacket;
import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyShoes;
import com.sxh.newfolder.DP2_抽象工厂.DP2.BuyWinterClothes;
import com.sxh.newfolder.DP2_抽象工厂.Jacket.MetersbonweJacket;
import com.sxh.newfolder.DP2_抽象工厂.Shoes.AdidasShoes;

/**
 * 第二套穿搭，美邦的外套和阿迪的鞋子
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class Collocation2 implements BuyWinterClothes {
    @Override
    public BuyJacket createJacket() {
        return new MetersbonweJacket();
    }

    @Override
    public BuyShoes createShoes() {
        return new AdidasShoes();
    }
}
