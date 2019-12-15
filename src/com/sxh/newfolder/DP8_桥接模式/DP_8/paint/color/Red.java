package com.sxh.newfolder.DP8_桥接模式.DP_8.paint.color;

/**
 * @author 一池春水倾半城
 * @date 2019/12/14 11:47
 */
public class Red implements Color {
    @Override
    public void painting(String shape) {
        System.out.println("绘制红色的" + shape);
    }
}
