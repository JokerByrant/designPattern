package com.sxh.newfolder.DP15_观察者模式.DP_15.简易版;

import java.util.LinkedList;
import java.util.List;

/**
 * 被观察者
 * @author sxh
 * @date 2019/12/31
 */
public class Subject {
    private List<Observer> observers = new LinkedList<>();

    public void setMsg(String msg) {
        notifyAll(msg);
    }

    /**
     * 通知观察者
     * @param msg
     */
    private void notifyAll(String msg) {
        observers.forEach(item -> item.update(msg));
    }

    /**
     * 增加观察者
     * @param observer
     */
    public void addAttach(Observer observer) {
        observers.add(observer);
    }
}
