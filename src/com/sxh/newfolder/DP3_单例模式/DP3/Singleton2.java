package com.sxh.newfolder.DP3_单例模式.DP3;

/**
 * 线程安全----饿汉式单例
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class Singleton2 {
    private final static Singleton2 instance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("这是饿汉式单例");
    }
}
