package com.sxh.newfolder.DP14_模板方法.游戏;

/**
 * 抽象游戏类
 * @author sxh
 * @date 2019/12/30
 */
public abstract class AbstractGame {
    /**
     * 模板方法，子类不可重写
     */
    public final void play() {
        initialize();
        startGame();
        endGame();
    }

    abstract void initialize();

    /**
     * 公开方法，子类可以重写这个方法，也可以使用父类的方法
     */
    public void startGame() {
        System.out.println("无人操控状态，AI模式启动！");
    };

    abstract void endGame();
}
