package com.sxh.newfolder.DP5_建造者模式.DP5_test;

/**
 * 地板装修 ==> 规定房间怎么装修
 * @author 一池春水倾半城
 * @date 2019/12/11 22:22
 */
public abstract class RoomDecoration {
    Room room = new Room();

    // 装修地板
    public abstract void decorateFloor();

    // 装修墙壁
    public abstract void decorateWall();

    // 风格设计
    public abstract void designStyle();

    public Room getRoom() {
        return room;
    }
}
