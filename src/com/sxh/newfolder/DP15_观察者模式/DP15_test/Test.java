package com.sxh.newfolder.DP15_观察者模式.DP15_test;

/**
 * @author 一池春水倾半城
 * @date 2020/1/6 21:49
 */
public class Test {
    public static void main(String[] args) {
        CsdnSystem csdnSystem = new CsdnSystem("程序人生！");
        csdnSystem.addRssUser(new RssUser("张三"));
        csdnSystem.addRssUser(new RssUser("李四"));
        csdnSystem.addRssUser(new RssUser("王五"));
        csdnSystem.addRssUser(new RssUser("赵六"));
        csdnSystem.publish();
    }
}
