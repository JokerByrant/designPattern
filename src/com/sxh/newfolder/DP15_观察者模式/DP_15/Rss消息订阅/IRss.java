package com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅;

/**
 * 消息订阅接口，由订阅人实现，确定订阅的内容
 * @author 一池春水倾半城
 * @date 2020/1/4 11:15
 */
public interface IRss {
    /**
     * 消息订阅，输出订阅的消息
     * @param content
     */
    public void rss(String content);
}
