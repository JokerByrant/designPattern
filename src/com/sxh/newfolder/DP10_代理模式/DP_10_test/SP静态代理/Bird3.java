package com.sxh.newfolder.DP10_代理模式.DP_10_test.SP静态代理;

import com.sxh.newfolder.DP10_代理模式.DP_10_test.service.Flyable;
import com.sxh.newfolder.DP10_代理模式.DP_10_test.service.impl.Bird;

/**
 * 使用静态代理 == 也叫聚合
 * @author 一池春水倾半城
 * @date 2019/12/18 23:08
 */
public class Bird3 implements Flyable {
    private Bird bird;

    public Bird3() {
        bird = new Bird();
    }

    @Override
    public void fly() {
        long start = System.currentTimeMillis();
        bird.fly();
        long end = System.currentTimeMillis();
        System.out.println("Fly time = " + (end - start));
    }
}
