package com.sxh.newfolder.DP2_抽象工厂.DP2_test;

import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.CategoryFactory;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Drink;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.GoodCategory.Food;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.drink.Juice;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.logProxy.PackageProxy;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.packageFactory.Package1;
import com.sxh.newfolder.DP2_抽象工厂.DP2_test.packageFactory.Package2;

import java.lang.reflect.InvocationHandler;

/**
 * @author 一池春水倾半城
 * @date 2019/12/28 13:11
 */
public class Test {
    public static void main(String[] args) {
        // 顾客1，选了套餐1
        Package1 package1 = new Package1();
        Drink juice = package1.createDrink();
        Food hamburg = package1.createFood();
        juice.buyDrink("");
        hamburg.buyFood("");

        // 打印出餐日志
        Package2 package2 = new Package2();
        PackageProxy handler = new PackageProxy(package2);
        CategoryFactory factory = (CategoryFactory) handler.getProxy();
        Drink drink = factory.createDrink();
        Food food = factory.createFood();
        drink.buyDrink("");
        food.buyFood("");
    }
}
