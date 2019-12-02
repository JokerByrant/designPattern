package com.sxh.history.builder.builder2;

/**
 * 装修工人
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public abstract class Decorator {
    protected LivingRoom livingRoom = new LivingRoom();
    abstract void buildWall();
    abstract void buildTV();
    abstract void buildSofa();

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }
}
