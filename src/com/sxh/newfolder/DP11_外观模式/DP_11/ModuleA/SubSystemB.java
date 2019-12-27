package com.sxh.newfolder.DP11_外观模式.DP_11.ModuleA;

/**
 * 模块A下的子系统B
 * @author sxh
 * @date 2019/12/27
 */
public class SubSystemB {
    public void loadDatas() {
        System.out.println("人工智能系统已经启动，正在加载数据 =====> " + this);
        System.out.println("....");
        System.out.println("数据加载完成");
    }

    @Override
    public String toString(){
        return "人工智能系统，模块A，子系统B，主要负责加载数据";
    }
}
