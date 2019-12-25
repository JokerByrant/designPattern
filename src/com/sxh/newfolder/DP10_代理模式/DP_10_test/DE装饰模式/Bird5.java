package com.sxh.newfolder.DP10_代理模式.DP_10_test.DE装饰模式;

import com.sxh.newfolder.DP10_代理模式.DP_10_test.service.Flyable;

/**
 * Bird5 === 用来打印日志
 * @author 一池春水倾半城
 * @date 2019/12/18 23:26
 */
public class Bird5 implements Flyable {
    private Flyable flyable;

    public Bird5(Flyable flyable) {
        this.flyable = flyable;
    }

    @Override
    public void fly() {
        System.out.println("Bird fly start...");
        flyable.fly();
        System.out.println("Bird fly end...");
    }
}
