package com.sxh.newfolder.DP5_建造者模式.DP5_test;

/**
 * 待装修的房子 ==> 列出房子的结构
 * @author 一池春水倾半城
 * @date 2019/12/11 22:19
 */
public class Room {
    // 地板样式
    private String floor = "";

    // 墙壁样式
    private String wall = "";

    // 整体风格
    private String style = "";

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "房间装修好啦：" +
                "地板是" + floor +
                ", 墙面是" + wall +
                ", 风格是" + style;
    }
}
