package com.sxh.newfolder.DP12_享元模式.DP_12;

/**
 * 圆形
 * @author 一池春水倾半城
 * @date 2019/12/28 15:42
 */
public class Circle implements IShape {
    private String color; // 颜色

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("绘制了一个颜色是   " + color + "   的圆形！");
    }
}
