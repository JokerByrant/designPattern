package com.sxh.newfolder.DP2_抽象工厂.DP2;

/**
 * 购买冬装 == 只给出要买哪些衣服，具体的品牌和样式由工厂决定
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public interface BuyWinterClothes {
    BuyJacket createJacket();
    BuyShoes createShoes();
}
