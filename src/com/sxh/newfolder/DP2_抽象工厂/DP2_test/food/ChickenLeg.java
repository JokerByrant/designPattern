package com.sxh.newfolder.DP2_抽象工厂.DP2_test.food;

import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Food;

/**
 * 鸡腿
 * @author 一池春水倾半城
 * @date 2019/12/28 13:01
 */
public class ChickenLeg implements Food {
    @Override
    public void buyFood(String food) {
        System.out.println("顾客买了一个鸡腿");
    }
}
