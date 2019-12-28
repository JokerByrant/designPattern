package com.sxh.newfolder.DP13_策略模式.DP_13.公式计算;

/**
 * 定义计算接口，根据传入的公式(字符串)来计算值
 * @author 一池春水倾半城
 * @date 2019/12/28 16:53
 */
public interface ICalculator {
    /**
     * 计算方法
     * @param formula 公式
     * @return
     */
    double calculate(String formula);
}
