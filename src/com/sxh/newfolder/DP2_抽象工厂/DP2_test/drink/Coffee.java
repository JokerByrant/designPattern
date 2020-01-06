package com.sxh.newfolder.DP2_抽象工厂.DP2_test.drink;

import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Drink;

/**
 * @author 一池春水倾半城
 * @date 2019/12/28 13:02
 */
public class Coffee implements Drink {
    @Override
    public void buyDrink(String name) {
        System.out.println("顾客买了一杯咖啡");
    }
}
