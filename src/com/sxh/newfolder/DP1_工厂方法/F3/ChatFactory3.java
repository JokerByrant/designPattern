package com.sxh.newfolder.DP1_工厂方法.F3;

import com.sxh.newfolder.DP1_工厂方法.DP1.Chat;
import com.sxh.newfolder.DP1_工厂方法.DP1.QQ;
import com.sxh.newfolder.DP1_工厂方法.DP1.WeChat;

/**
 * 静态工厂模式，无需创建工厂实例
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class ChatFactory3 {
    public static Chat createQQChat() {
        return new QQ();
    }
    public static Chat createWeChat() {
        return new WeChat();
    }
}
