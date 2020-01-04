package com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅;

/**
 * rss提供方管理接口
 * @author 一池春水倾半城
 * @date 2020/1/4 11:19
 */
public interface IRssPublisher {
    /**
     * 增加订阅用户
     * @param rss
     */
    void add(IRss rss);

    /**
     * 移除订阅用户
     * @param rss
     */
    void remove(IRss rss);

    /**
     * 移除订阅用户，根据id
     * @param id
     */
    void remove(int id);

    /**
     * 通知订阅用户
     * @param content
     */
    void notifyRssAll(String content);

    /**
     * 发布消息
     */
    void publish();
}
