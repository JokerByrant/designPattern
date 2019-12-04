package com.sxh.newfolder.DP6_适配器模式.DP6_test;

/**
 * 飞虎 === 继承飞禽类，并包容一个老虎类
 * @author 一池春水倾半城
 * @date 2019/12/4 23:44
 */
public class FlyTiger extends FlyAnimal{
    private Tiger tiger;

    public FlyTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    /**
     * 飞虎虽然会飞，但它们吃的和老虎一样
     */
    @Override
    public void eat() {
        tiger.eat();
    }

    @Override
    public void fly() {
        System.out.println("你没有看错，这是一只正在飞的" + tiger.getName());
    }
}
