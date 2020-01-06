package com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory;

/**
 * 套餐种类
 * @author 一池春水倾半城
 * @date 2019/12/28 13:06
 */
public interface CategoryFactory {
    public Drink createDrink();
    public Food createFood();
}
