package com.sxh.newfolder.DP15_观察者模式.DP_15.简易版;

/**
 * @author sxh
 * @date 2019/12/31
 */
public class B_Observer implements Observer {
    @Override
    public void update(String msg) {
        System.out.println(B_Observer.class.getName() + " : " + msg);
    }
}
