package com.sxh.newfolder.DP5_建造者模式.DP5_test;

/**
 * 包工头2 ==> 只设计装修风格和装修墙面
 * @author 一池春水倾半城
 * @date 2019/12/11 22:34
 */
public class Contractor2 {
    private RoomDecoration roomDecoration;

    public Contractor2(RoomDecoration roomDecoration) {
        this.roomDecoration = roomDecoration;
    }

    public Room decorateRoom() {
        roomDecoration.designStyle();
        roomDecoration.decorateWall();
        return roomDecoration.getRoom();
    }
}
