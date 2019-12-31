package com.sxh.newfolder.DP15_观察者模式.DP_15.简易版;

/**
 * 观察者接口 --- 定义观察者的行为，具体做了什么由具体实现类指定
 * @author sxh
 * @date 2019/12/31
 */
public interface Observer {
    void update(String msg);
}
