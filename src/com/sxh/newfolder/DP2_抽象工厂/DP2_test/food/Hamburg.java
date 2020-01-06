package com.sxh.newfolder.DP2_抽象工厂.DP2_test.food;

import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Food;

/**
 * 汉堡包
 * @author 一池春水倾半城
 * @date 2019/12/28 12:57
 */
public class Hamburg implements Food {
    @Override
    public void buyFood(String food) {
        System.out.println("顾客购买了一个汉堡包");
    }
}
