package com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅;

/**
 * @author 一池春水倾半城
 * @date 2020/1/4 11:29
 */
public class V2exSystem extends Subscription {
    private String content;

    public V2exSystem(String content) {
        this.content = content;
    }

    public V2exSystem() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void publish() {
        System.out.println("rss消息提示 ====> 来自v2ex!");
        notifyRssAll(content);
    }
}
