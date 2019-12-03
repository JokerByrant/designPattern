package com.sxh.newfolder.DP3_单例模式;

import com.sxh.newfolder.DP3_单例模式.DP3.*;

/**
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class FactoryTest {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.show();

        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.show();

        Singleton3 singleton3 = Singleton3.getInstance();
        singleton3.show();

        Singleton4 singleton4 = Singleton4.getInstance();
        singleton4.show();

        Singleton5 singleton5 = Singleton5.getInstance();
        singleton5.show();

    }
}
