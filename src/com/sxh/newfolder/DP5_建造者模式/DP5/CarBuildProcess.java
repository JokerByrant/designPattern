package com.sxh.newfolder.DP5_建造者模式.DP5;

/**
 * 汽车制造流程
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public abstract class CarBuildProcess {
    Car car = new Car();

    // 制造发动机
    abstract void buildEngine();

    // 为汽车起名
    abstract void giveName();

    // 制造车轱辘
    abstract void buildTire();

    // 设计车的外观
    abstract void designAppearance();

    public Car getCar() {
        return car;
    }
}
