package com.sxh.newfolder.DP2_抽象工厂.DP2_test.packageFactory;

import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.CategoryFactory;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Drink;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Food;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.drink.Juice;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.food.Hamburg;

/**
 * 套餐1 ===> 果汁和汉堡包
 * @author 一池春水倾半城
 * @date 2019/12/28 13:09
 */
public class Package1 implements CategoryFactory {
    public Package1() {
        System.out.println("=====顾客选择了套餐1=====");
    }

    @Override
    public Drink createDrink() {
        return new Juice();
    }

    @Override
    public Food createFood() {
        return new Hamburg();
    }
}
