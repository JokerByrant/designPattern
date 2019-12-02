package com.sxh.history.builder.builder2;

/**
 * 装修工人1
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Decorator1 extends Decorator{
    @Override
    void buildWall() {
        livingRoom.setWall("w1");
    }

    @Override
    void buildTV() {
        livingRoom.setTV("tv1");
    }

    @Override
    void buildSofa() {
        livingRoom.setSofa("sofa1");
    }
}
