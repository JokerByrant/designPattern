package com.sxh.newfolder.DP15_观察者模式;

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
    }

    private static void simpleTest() {
        Subject subject = new Subject();
        Observer aObserver = new A_Observer();
        Observer bObserver = new B_Observer();
        subject.addAttach(aObserver);
        subject.addAttach(bObserver);
        subject.setMsg("明天是元旦，休息一天！");
    }
}
