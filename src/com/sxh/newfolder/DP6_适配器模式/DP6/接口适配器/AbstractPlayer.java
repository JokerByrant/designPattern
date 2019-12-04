package com.sxh.newfolder.DP6_适配器模式.DP6.接口适配器;

import com.sxh.newfolder.DP6_适配器模式.DP6.Player;

/**
 * 接口适配器
 * tips: 抽象类中的方法 ==> 无需全部实现（抽象方法必须实现）
 *       接口中的方法 ==> 必须全部实现
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public abstract class AbstractPlayer implements Player{
    @Override
    public void playMvs() {
    }

    @Override
    public void playMusics() {
    }

    @Override
    public void playMovies() {
    }

    public abstract void show();
}
