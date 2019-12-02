package com.sxh.newfolder.DP1_工厂方法.DP1;

/**
 * 微信实现了聊天接口
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class WeChat implements Chat {
    @Override
    public void chatting(String seqNo) {
        System.out.println("使用微信进行聊天 -- " + seqNo);
    }
}
