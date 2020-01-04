package com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅;

/**
 * @author 一池春水倾半城
 * @date 2020/1/4 11:17
 */
public class RssUser implements IRss {
    private String name;

    private int id;

    public RssUser(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void rss(String content) {
        System.out.println("尊敬的" + name + "，您收到一条订阅消息：" + content );
    }
}
