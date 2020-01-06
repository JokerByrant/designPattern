package com.sxh.newfolder.DP15_观察者模式.DP15_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 抽象一个消息发布系统，实现一个订阅系统的基本功能，方便个性化定制
 * @author 一池春水倾半城
 * @date 2020/1/6 21:41
 */
public abstract class Subscription implements IRssPublisher{
    private List<IRss> rssUsers = new ArrayList<>();

    @Override
    public void addRssUser(IRss rss) {
        rssUsers.add(rss);
    }

    @Override
    public void removeRssUser(String name) {
        Iterator<IRss> iterator = rssUsers.iterator();
        RssUser user;
        while (iterator.hasNext()) {
            user = (RssUser) iterator.next();
            if (user.getName().equals(name)) {
                iterator.remove();
            }
        }
    }

    @Override
    public void notifyAllUser(String content) {
        rssUsers.forEach(user -> user.rss(content));
    }
}
