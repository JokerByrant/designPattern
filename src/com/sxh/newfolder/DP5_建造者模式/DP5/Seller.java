package com.sxh.newfolder.DP5_建造者模式.DP5;

/**
 * 销售人员，开始卖车
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class Seller {
    private CarBuildProcess carBuildProcess;

    public Seller(CarBuildProcess carBuildProcess) {
        this.carBuildProcess = carBuildProcess;
    }

    // 卖车
    public Car sell() {
        // 汽车名
        carBuildProcess.giveName();
        // 汽车发动机
        carBuildProcess.buildEngine();
        // 汽车外观
        carBuildProcess.designAppearance();

        return carBuildProcess.getCar();
    }
}
