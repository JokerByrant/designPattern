package com.sxh.newfolder.DP3_单例模式.DP3;

/**
 * 线程安全----懒汉式单例
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class Singleton4 {
    private static Singleton4 instance = null;

    private Singleton4() {}

    // 锁加载方法上，每一次获取实例时都会对当前的对象加锁
    public synchronized static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

    public void show() {
        System.out.println("这是线程安全的懒汉式单例");
    }
}
