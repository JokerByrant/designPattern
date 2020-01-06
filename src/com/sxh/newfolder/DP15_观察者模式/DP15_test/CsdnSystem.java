package com.sxh.newfolder.DP15_观察者模式.DP15_test;

/**
 * @author 一池春水倾半城
 * @date 2020/1/6 21:47
 */
public class CsdnSystem extends Subscription {
    private String content;

    public CsdnSystem(String content) {
        this.content = content;
    }

    @Override
    public void publish() {
        System.out.println("============消息来自Csdn=================");
        notifyAllUser(content);
    }
}
