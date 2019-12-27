package com.sxh.newfolder.DP11_外观模式.DP_11.ModuleA;

/**
 * 模块A下的子系统A
 * @author sxh
 * @date 2019/12/27
 */
public class SubSystemA {
    public void initSystem() {
        System.out.println("系统正在启动，请稍等... ====> " + this);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("等待" + (i+1) + "s");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "人工智能系统，模块A，子系统A，主要负责启动系统";
    }
}
