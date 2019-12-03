package com.sxh.newfolder.DP3_单例模式.DP3;

/**
 * 单例模式1，懒汉式
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1 () {}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return  instance;
    }

    public void show() {
        System.out.println("这是懒汉式单例");
    }
}
