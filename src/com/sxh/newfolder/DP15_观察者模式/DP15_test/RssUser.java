package com.sxh.newfolder.DP15_观察者模式.DP15_test;

/**
 * 消息订阅人 ===> 实现了消息订阅接口
 * @author 一池春水倾半城
 * @date 2020/1/6 21:36
 */
public class RssUser implements IRss{
    private String name;

    public RssUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void rss(String content) {
        System.out.println(name + "早上好！您订阅的内容有更新: " + content);
    }
}
