package com.sxh.newfolder.DP1_工厂方法.F1;

import com.sxh.newfolder.DP1_工厂方法.DP1.Chat;
import com.sxh.newfolder.DP1_工厂方法.DP1.QQ;
import com.sxh.newfolder.DP1_工厂方法.DP1.WeChat;

/**
 * 简单(单方法)工厂模式
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class ChatFactory1 {
    public Chat createChat(String tools) {
        if ("QQ".equals(tools)) {
            return new QQ();
        } else if ("WeChat".equals(tools)) {
            return new WeChat();
        } else {
            return null;
        }
    }
}
