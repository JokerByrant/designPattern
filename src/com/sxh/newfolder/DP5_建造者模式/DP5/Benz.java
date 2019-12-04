package com.sxh.newfolder.DP5_建造者模式.DP5;

/**
 * 奔驰汽车
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class Benz extends CarBuildProcess{

    @Override
    public void buildEngine() {
        car.addParts("V8引擎");
    }

    @Override
    public void giveName() {
        car.addParts("奔驰大G");
    }

    @Override
    public void buildTire() {
        car.addParts("轮胎");
    }

    @Override
    public void designAppearance() {
        car.addParts("红色");
    }
}
