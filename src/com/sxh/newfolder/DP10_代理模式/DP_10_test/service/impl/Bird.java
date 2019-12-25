package com.sxh.newfolder.DP10_代理模式.DP_10_test.service.impl;

import com.sxh.newfolder.DP10_代理模式.DP_10_test.service.Flyable;

import java.util.Random;

/**
 * 飞鸟类 === 随机模拟小鸟飞行时间
 * @author 一池春水倾半城
 * @date 2019/12/18 22:59
 */
public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
