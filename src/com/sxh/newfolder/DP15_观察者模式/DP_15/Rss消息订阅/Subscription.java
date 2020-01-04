package com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 抽闲一个订阅类，实现rss操作
 * @author 一池春水倾半城
 * @date 2020/1/4 11:24
 */
public abstract class Subscription implements IRssPublisher{
    private List<IRss> rssList = new ArrayList<>();

    @Override
    public void add(IRss rss) {
        rssList.add(rss);
    }

    @Override
    public void remove(IRss rss) {
        rssList.remove(rss);
    }

    @Override
    public void remove(int id) {
        Iterator<IRss> iterator = rssList.iterator();
        RssUser user = null;
        while (iterator.hasNext()) {
            user = (RssUser) iterator.next();
            if (user.getId() == id) {
                iterator.remove();
            }
        }
    }

    @Override
    public void notifyRssAll(String content) {
        rssList.forEach(rss -> rss.rss(content));
    }
}
