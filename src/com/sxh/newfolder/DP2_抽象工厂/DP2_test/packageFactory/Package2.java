package com.sxh.newfolder.DP2_抽象工厂.DP2_test.packageFactory;

import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.CategoryFactory;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Drink;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Food;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.drink.Coffee;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.food.ChickenLeg;

/**
 * 套餐2  ==> 咖啡和鸡腿
 * @author 一池春水倾半城
 * @date 2019/12/28 13:10
 */
public class Package2 implements CategoryFactory {
    public Package2() {
        System.out.println("=====顾客选择了套餐2=====");
    }

    @Override
    public Drink createDrink() {
        return new Coffee();
    }

    @Override
    public Food createFood() {
        return new ChickenLeg();
    }
}
