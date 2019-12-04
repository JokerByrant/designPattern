package com.sxh.newfolder.DP6_适配器模式.DP6.接口适配器;

/**
 * 实现全部功能
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class CPlayer extends AbstractPlayer {
    @Override
    public void show() {
        System.out.println("=====播放器C功能展示：");
        playMovies();
        playMusics();
        playMvs();
    }

    @Override
    public void playMvs() {
        System.out.println("播放器C播放MV");
    }

    @Override
    public void playMusics() {
        System.out.println("播放器C播放音乐");
    }

    @Override
    public void playMovies() {
        System.out.println("播放器C播放电影");
    }
}
