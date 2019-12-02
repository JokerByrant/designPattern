package com.sxh.history.builder.builder1;

/**
 * 公司，用于指挥组装电脑的员工，和发放电脑需要的配置
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Company {
    public ComputerBuilder builder;
    public Company(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        builder.buildCpu();
        builder.buildGraphicsCard();
        builder.buildHardDisk();
        builder.buildMemoryBar();
        builder.buildPower();
        builder.buildSoundCard();
        return builder.createComputer();
    }
}
