package com.sxh.newfolder.DP1_工厂方法;

import com.sxh.newfolder.DP1_工厂方法.DP1.Chat;
import com.sxh.newfolder.DP1_工厂方法.F1.ChatFactory1;
import com.sxh.newfolder.DP1_工厂方法.F2.ChatFactory2;
import com.sxh.newfolder.DP1_工厂方法.F3.ChatFactory3;

/**
 * 工厂模式测试
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class FactoryTest {
    public static void main(String[] args) {
        // 1、使用简单工厂进行测试
        ChatFactory1 chatFactory1 = new ChatFactory1();
        String seqNo = "1";
        Chat qq1 = chatFactory1.createChat("QQ");
        Chat weChat1 = chatFactory1.createChat("WeChat");
        qq1.chatting(seqNo);
        weChat1.chatting(seqNo);
        Chat momo = chatFactory1.createChat("MoMo");
        if (momo == null) {
            System.out.println("创建陌陌聊天工具失败...");
        } else {
            momo.chatting(seqNo);
        }

        System.out.println("=============手动分割===============");

        // 2、使用多方法工厂进行测试
        seqNo = "2";
        ChatFactory2 chatFactory2 = new ChatFactory2();
        Chat qq2 = chatFactory2.createQQChat();
        Chat weChat2 = chatFactory2.createWeChat();
        qq2.chatting(seqNo);
        weChat2.chatting(seqNo);

        System.out.println("=============手动分割===============");

        // 3、使用静态工厂进行测试
        seqNo = "3";
        Chat qq3 = ChatFactory3.createQQChat();
        Chat weChat3 = ChatFactory3.createWeChat();
        qq3.chatting(seqNo);
        weChat3.chatting(seqNo);
    }
}
