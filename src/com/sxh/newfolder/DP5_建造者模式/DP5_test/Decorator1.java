package com.sxh.newfolder.DP5_建造者模式.DP5_test;

/**
 * 装修师傅王大壮 ==> 他比较擅长北欧风的装修
 * @author 一池春水倾半城
 * @date 2019/12/11 22:25
 */
public class Decorator1 extends RoomDecoration{

    @Override
    public void decorateFloor() {
        room.setFloor("原木地板");
    }

    @Override
    public void decorateWall() {
        room.setWall("淡蓝色墙面");
    }

    @Override
    public void designStyle() {
        room.setStyle("北欧风设计");
    }
}
