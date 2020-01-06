package com.sxh.newfolder.DP15_观察者模式.DP15_test;

/**
 * 消息订阅接口
 * @author 一池春水倾半城
 * @date 2020/1/6 21:35
 */
public interface IRss {
    /**
     * 订阅人获取订阅内容
     * @param content
     */
    public void rss(String content);
}
