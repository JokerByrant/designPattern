package com.sxh.newfolder.DP3_单例模式.DP3;

/**
 * 线程安全----懒汉式单例
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            // 只在第一次创建对象时才加锁
            synchronized (Singleton3.class) {
                instance = new Singleton3();
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("这是线程安全的懒汉式单例");
    }
}
