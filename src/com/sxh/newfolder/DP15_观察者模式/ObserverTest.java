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

        /**
         * 百科如下描述观察者模式：
         * 观察者模式（有时又被称为发布/订阅模式）是软件设计模式的一种。
         * 在此种模式中，一个目标对象管理所有相依于它的观察者对象，并且在它本身的状态改变时主动发出通知。
         * 这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实现事件处理系统。
         *
         * 看了解释，主要记住这句话就行了，又被称为发布/订阅模式
         * 优点如下：
         * （1）主要或目标对象与被观察之间是完全解耦的，因此二者很容易被扩展
         * （2）主对象可以将改变的状态结果通过链条的形式传递给依赖于其的所有被观察者对象，
         *      大大节省了通知的代码量（否则需要人工去一个个通知）
         * 缺点如下：
         *      由于观察者的数量不定，如果数量过大的话，链式的通知方法会严重影响性能！！！
         */
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
