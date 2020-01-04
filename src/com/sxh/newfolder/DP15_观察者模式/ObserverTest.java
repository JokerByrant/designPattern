package com.sxh.newfolder.DP15_观察者模式;

import com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅.IRss;
import com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅.RssUser;
import com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅.Subscription;
import com.sxh.newfolder.DP15_观察者模式.DP_15.Rss消息订阅.V2exSystem;
import com.sxh.newfolder.DP15_观察者模式.DP_15.简易版.A_Observer;
import com.sxh.newfolder.DP15_观察者模式.DP_15.简易版.B_Observer;
import com.sxh.newfolder.DP15_观察者模式.DP_15.简易版.Observer;
import com.sxh.newfolder.DP15_观察者模式.DP_15.简易版.Subject;

/**
 * 观察者模式测试类
 * @author sxh
 * @date 2019/12/31
 */
public class ObserverTest {
    public static void main(String[] args) {
        simpleTest();
        rssTest();
    }

    private static void simpleTest() {
        System.out.println("=====================简易版");
        Subject subject = new Subject();
        Observer aObserver = new A_Observer();
        Observer bObserver = new B_Observer();
        subject.addAttach(aObserver);
        subject.addAttach(bObserver);
        subject.setMsg("明天是元旦，休息一天！");
    }

    private static void rssTest() {
        System.out.println("=====================Rss消息订阅");
        IRss user1 = new RssUser("张三", 1);
        IRss user2 = new RssUser("李四", 2);
        V2exSystem v2ex = new V2exSystem();
        v2ex.add(user1);
        v2ex.add(user2);
        v2ex.setContent("2020新年快乐！");
        v2ex.publish();

        System.out.println("张三取消订阅！");
        v2ex.remove(user1);
        v2ex.publish();
    }
}
