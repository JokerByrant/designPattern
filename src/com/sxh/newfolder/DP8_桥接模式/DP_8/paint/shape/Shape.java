package com.sxh.newfolder.DP8_桥接模式.DP_8.paint.shape;

import com.sxh.newfolder.DP8_桥接模式.DP_8.paint.color.Color;

/**
 * 抽象形状类 === 聚合了Color的实现类
 * @author 一池春水倾半城
 * @date 2019/12/14 11:47
 */
public abstract class Shape {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // 图形绘制方法
    public abstract void draw();
}
