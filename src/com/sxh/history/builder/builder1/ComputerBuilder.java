package com.sxh.history.builder.builder1;

/**
 * 组装电脑构造类
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();
    abstract void buildCpu();
    abstract void buildGraphicsCard();
    abstract void buildSoundCard();
    abstract void buildHardDisk();
    abstract void buildMemoryBar();
    abstract void buildPower();
    public Computer createComputer() {
        return computer;
    };

}
