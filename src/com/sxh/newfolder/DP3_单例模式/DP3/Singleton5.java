package com.sxh.newfolder.DP3_单例模式.DP3;

/**
 * 内部静态工厂提前创建好实例对象----线程安全
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class Singleton5 {
    private Singleton5() {}

    private static class SingletonFactory {
        private static final Singleton5 singleton5 = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonFactory.singleton5;
    }

    public void show() {
        System.out.println("这是由内部静态工厂提前创建好对象的，线程安全的单例模式");
    }
}
