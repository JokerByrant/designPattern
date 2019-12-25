package com.sxh.newfolder.DP10_代理模式.DP_10_test.EX继承;

import com.sxh.newfolder.DP10_代理模式.DP_10_test.service.impl.Bird;

/**
 * 继承飞鸟类 === 计算飞鸟的飞行时间
 * @author 一池春水倾半城
 * @date 2019/12/18 23:00
 */
public class Bird2 extends Bird {
    @Override
    public void fly() {
        long startTime = System.currentTimeMillis();
        super.fly();
        long endTime = System.currentTimeMillis();
        System.out.println("Fly time = " + (endTime - startTime));
    }
}
