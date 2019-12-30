package com.sxh.newfolder.DP14_模板方法.游戏;

/**
 * @author sxh
 * @date 2019/12/30
 */
public class ActionGame extends AbstractGame {
    @Override
    void initialize() {
        System.out.println("GTA5正在初始化...");
    }

    @Override
    void endGame() {
        System.out.println("游戏结束，You just killed Trevor!");
    }
}
