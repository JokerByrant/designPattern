package com.sxh.newfolder.DP5_建造者模式.DP5_test;

/**
 * 装修师傅李大春 ==> 他比较擅长中国风装修
 * @author 一池春水倾半城
 * @date 2019/12/11 22:27
 */
public class Decorator2 extends RoomDecoration {
    @Override
    public void decorateFloor() {
        room.setFloor("木质地板");
    }

    @Override
    public void decorateWall() {
        room.setWall("大红花墙面");
    }

    @Override
    public void designStyle() {
        room.setStyle("中国风设计");
    }
}
