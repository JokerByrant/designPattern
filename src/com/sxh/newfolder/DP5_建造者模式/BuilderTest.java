package com.sxh.newfolder.DP5_建造者模式;

import com.sxh.newfolder.DP5_建造者模式.DP5.Benz;
import com.sxh.newfolder.DP5_建造者模式.DP5.Bmw;
import com.sxh.newfolder.DP5_建造者模式.DP5.Car;
import com.sxh.newfolder.DP5_建造者模式.DP5.Seller;

/**
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class BuilderTest {
    public static void main(String[] args) {
        // 客户想要一辆奔驰
        Benz benz = new Benz();
        // 销售人员1开始推销这辆奔驰大G
        Seller seller = new Seller(benz);
        // 推销成功
        Car car = seller.sell();
        System.out.println(car);

        // 客户2想要一辆宝马
        Bmw bmw = new Bmw();
        // 销售人员2开始推销
        Seller seller2 = new Seller(bmw);
        Car car2 = seller2.sell();
        System.out.println(car2);

        /**
         * 产品：定义产品的一些属性（Car）
         * 抽象建造类：定义产品中属性的赋值方法，主要是规定创建一个产品需要哪些步骤 CarBuildProcess
         * 建造类：对抽象建造类的具体实现，完成了属性的赋值，并返回了一个具体产品 Benz,Bmw
         * 指挥类：控制整个组合的过程
         * 场景：当一些基本的部件属性不变，而其组合经常变化的时候，或者其具体的实现经常发生复杂的变化的时候
         */
    }
}
