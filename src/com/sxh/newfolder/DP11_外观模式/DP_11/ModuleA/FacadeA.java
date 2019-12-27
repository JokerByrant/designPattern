package com.sxh.newfolder.DP11_外观模式.DP_11.ModuleA;

/**
 * 外观模式A ===> 聚合模块A下子系统A和子系统B，降低客户端操作模块A的复杂度
 * @author sxh
 * @date 2019/12/27
 */
public class FacadeA {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public FacadeA() {
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
    }

    /**
     * 将模块A的功能封装一下，松散客户端和模块A中各个子系统的耦合关系
     * 让模块中的各个子系统更容易维护
     */
    public void initialize() {
        subSystemA.initSystem();
        subSystemB.loadDatas();
    }
}
