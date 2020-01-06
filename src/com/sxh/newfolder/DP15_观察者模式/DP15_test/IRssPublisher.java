package com.sxh.newfolder.DP15_观察者模式.DP15_test;

/**
 * 消息发布接口
 * @author 一池春水倾半城
 * @date 2020/1/6 21:38
 */
public interface IRssPublisher {
    /**
     * 添加订阅人
     * @param rss
     */
    public void addRssUser(IRss rss);

    /**
     * 移除消息订阅人
     * @param name
     */
    public void removeRssUser(String name);

    /**
     * 发布消息

     */
    public void publish();

    /**
     * 通知所有订阅用户
     * @param content
     */
    public void notifyAllUser(String content);
}
