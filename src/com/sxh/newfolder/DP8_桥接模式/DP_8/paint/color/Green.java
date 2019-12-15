package com.sxh.newfolder.DP8_桥接模式.DP_8.paint.color;

import com.sxh.newfolder.DP8_桥接模式.DP_8.paint.color.Color;

/**
 * @author 一池春水倾半城
 * @date 2019/12/14 11:46
 */
public class Green implements Color {
    @Override
    public void painting(String shape) {
        System.out.println("绘制绿色的" + shape);
    }
}
