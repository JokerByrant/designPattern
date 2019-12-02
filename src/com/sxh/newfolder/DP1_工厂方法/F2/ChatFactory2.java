package com.sxh.newfolder.DP1_工厂方法.F2;

import com.sxh.newfolder.DP1_工厂方法.DP1.Chat;
import com.sxh.newfolder.DP1_工厂方法.DP1.QQ;
import com.sxh.newfolder.DP1_工厂方法.DP1.WeChat;

/**
 * 多方法工厂模式 == 需要那个，就用哪个方法
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class ChatFactory2 {
    public Chat createQQChat() {
        return new QQ();
    }
    public Chat createWeChat() {
        return new WeChat();
    }
}
