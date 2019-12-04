package com.sxh.newfolder.DP6_适配器模式.DP6;

/**
 * 播放器接口
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public interface Player {
    /**
     * 播放MV
     */
    public void playMvs();

    /**
     * 播放音乐  ===  注意方法名与MP3播放音乐的功能方法名一致
     */
    public void playMusics();

    /**
     * 播放电影
     */
    public void playMovies();
}
