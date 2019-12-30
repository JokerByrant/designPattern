package com.sxh.newfolder.DP14_模板方法.游戏;

/**
 * @author sxh
 * @date 2019/12/30
 */
public class FootballGame extends AbstractGame {
    @Override
    void initialize() {
        System.out.println("FIFA 20正在初始化");
    }

    @Override
    public void startGame() {
        System.out.println("你选择了拜仁进行比赛");
    }

    @Override
    void endGame() {
        System.out.println("Congratulation! You just Beat Arsenal！");
    }
}
