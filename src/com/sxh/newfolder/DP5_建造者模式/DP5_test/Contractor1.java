package com.sxh.newfolder.DP5_建造者模式.DP5_test;

/**
 * 包工头1 ==> 全套服务 ==> 根据客户需要指挥房间哪些需要装修，以及装修顺序
 * @author 一池春水倾半城
 * @date 2019/12/11 22:29
 */
public class Contractor1 {
    private RoomDecoration roomDecoration;

    public Contractor1(RoomDecoration roomDecoration) {
        this.roomDecoration = roomDecoration;
    }

    public Room decorateRoom() {
        roomDecoration.designStyle();
        roomDecoration.decorateWall();
        roomDecoration.decorateFloor();
        return roomDecoration.getRoom();
    }
}
