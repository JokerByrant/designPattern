package com.sxh.newfolder.DP13_策略模式.DP_13.公式计算;

/**
 * 乘法运算
 * @author 一池春水倾半城
 * @date 2019/12/28 17:01
 */
public class Mul implements ICalculator{
    @Override
    public double calculate(String formula) {
        double[] valArray = CalculatorHelper.getValArray(formula, "\\*");
        return valArray[0] * valArray[1];
    }
}
