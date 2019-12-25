package com.sxh.newfolder.DP10_代理模式.DP_10_test.DE装饰模式;

import com.sxh.newfolder.DP10_代理模式.DP_10_test.service.Flyable;

/**
 * Bird4 == 用来计算飞行时间
 * @author 一池春水倾半城
 * @date 2019/12/18 23:22
 */
public class Bird4 implements Flyable {
    /**
     * 装饰者模式和静态模式的区别就在这儿，装饰着模式没有指定具体的实现类，实现类由外界控制
     */
    private Flyable flyable;

    public Bird4(Flyable flyable) {
        this.flyable = flyable;
    }

    @Override
    public void fly() {
        long start = System.currentTimeMillis();
        flyable.fly();
        long end = System.currentTimeMillis();
        System.out.println("Fly time = " + (end - start));
    }
}
