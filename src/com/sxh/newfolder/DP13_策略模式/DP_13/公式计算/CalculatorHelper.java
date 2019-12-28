package com.sxh.newfolder.DP13_策略模式.DP_13.公式计算;

/**
 * 计算辅助类，用于提取出公式中的数
 * @author 一池春水倾半城
 * @date 2019/12/28 16:56
 */
public class CalculatorHelper {
    /**
     * 提取出公式中的数
     * @param formula 公式
     * @param pattern 运算符
     * @return
     */
    public static double[] getValArray(String formula, String pattern) {
        String[] strArr = formula.trim().split(pattern);
        double[] array = new double[2];
        array[0] = Double.parseDouble(strArr[0]);
        array[1] = Double.parseDouble(strArr[1]);
        return array;
    }
}
