package com.sxh.newfolder.DP8_桥接模式;

import com.sxh.newfolder.DP8_桥接模式.DP_8.paint.color.Color;
import com.sxh.newfolder.DP8_桥接模式.DP_8.paint.color.Green;
import com.sxh.newfolder.DP8_桥接模式.DP_8.paint.color.Red;
import com.sxh.newfolder.DP8_桥接模式.DP_8.paint.shape.Circle;
import com.sxh.newfolder.DP8_桥接模式.DP_8.paint.shape.Rectangle;
import com.sxh.newfolder.DP8_桥接模式.DP_8.paint.shape.Shape;
import com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.format.Mkv;
import com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.format.Rmvb;
import com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.platform.Linux;
import com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.platform.Platform;
import com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.platform.Windows;

/**
 * @author 一池春水倾半城
 * @date 2019/12/14 11:50
 */
public class BridgeTest {
    public static void main(String[] args) {
        paint();
        playMusic();

        /**
         * 作用场景：有两个变化维度的系统，他们之间通过组合形成不同的实体。
         * 例如下例：要绘制矩形、圆形，需要两个形状类，但如果要绘制不同颜色，如红色、绿色等，那么此时有两种解决方案：
         *  1. 为每一种形状都提供一个不同颜色的版本
         *  2. 根据实际需要对形状和颜色进行整合
         */
    }

    private static void paint() {
        Color red = new Red();
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(red);
        rectangle.draw();

        Color green = new Green();
        Circle circle = new Circle();
        circle.setColor(green);
        circle.draw();
    }

    private static void playMusic() {
        Platform linux = new Linux();
        Rmvb rmvb = new Rmvb();
        rmvb.setPlatform(linux);
        rmvb.playVideo();

        Platform windows = new Windows();
        Mkv mkv = new Mkv();
        mkv.setPlatform(windows);
        mkv.playVideo();
    }
}
