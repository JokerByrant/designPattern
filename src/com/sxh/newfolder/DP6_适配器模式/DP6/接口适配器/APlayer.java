package com.sxh.newfolder.DP6_适配器模式.DP6.接口适配器;

/**
 * 只有播放音乐的功能
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class APlayer extends AbstractPlayer {
    @Override
    public void playMusics() {
        System.out.println("播放器A播放音乐！");
    }

    @Override
    public void show() {
        System.out.println("=====播放器A功能展示：");
        playMusics();
        playMovies();
        playMvs();
    }
}
