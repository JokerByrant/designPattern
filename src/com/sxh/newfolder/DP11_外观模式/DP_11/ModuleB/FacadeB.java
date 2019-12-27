package com.sxh.newfolder.DP11_外观模式.DP_11.ModuleB;

/**
 * 外观模式B ====> 聚合模块B中子系统C和子系统D，降低客户端操作模块B的复杂度
 * @author sxh
 * @date 2019/12/27
 */
public class FacadeB {
    private SubSystemC subSystemC;
    private SubSystemD subSystemD;

    public FacadeB() {
        this.subSystemC = new SubSystemC();
        this.subSystemD = new SubSystemD();
    }

    /**
     * 将模块B的功能封装一下，松散客户端与B模块中的各个子系统间的耦合关系
     * 让模块中的各个子系统更容易扩展和维护
     */
    public void work() {
        subSystemC.sayHello();
        subSystemD.working();
    }
}
