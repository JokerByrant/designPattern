package com.sxh.history.singleton;

/**
 * 饿汉式
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
