package com.sxh.newfolder.DP5_建造者模式.DP5;

/**
 * 宝马
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class Bmw extends CarBuildProcess{
    @Override
    void buildEngine() {
        car.addParts("直列6缸");
    }

    @Override
    void giveName() {
        car.addParts("宝马x7");
    }

    @Override
    void buildTire() {
        // 不太熟悉车轮胎哈哈
        car.addParts("轮胎");
    }

    @Override
    void designAppearance() {
        car.addParts("白色");
    }
}
