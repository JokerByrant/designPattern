package com.sxh.newfolder.DP6_适配器模式.DP6.接口适配器;

/**
 * 只实现播放电影的功能
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class BPlayer extends AbstractPlayer{
    @Override
    public void show() {
        System.out.println("=====播放器B功能展示：");
        playMovies();
        playMusics();
        playMvs();
    }

    @Override
    public void playMovies() {
        System.out.println("播放器B播放电影");
    }
}
