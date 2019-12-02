package com.sxh.newfolder.DP1_工厂方法.DP1;

/**
 * QQ实现了聊天记录接口
 * @author 一池春水倾半城
 * @date 2019/12/2
 */
public class QQ implements Chat{
    @Override
    public void chatting(String seqNo) {
        System.out.println("使用QQ进行聊天 -- " + seqNo);
    }
}
