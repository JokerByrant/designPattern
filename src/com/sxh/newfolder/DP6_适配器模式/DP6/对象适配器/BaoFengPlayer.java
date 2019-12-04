package com.sxh.newfolder.DP6_适配器模式.DP6.对象适配器;

import com.sxh.newfolder.DP6_适配器模式.DP6.Mp3;
import com.sxh.newfolder.DP6_适配器模式.DP6.Player;

/**
 * 对象适配器 === 与类适配器一样，将Mp3播放音乐的功能直接拓展到播放器里，即无需再实现播放器播放音乐的功能了
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class BaoFengPlayer implements Player{
    /**
     * 唯一不同的地方是：对象适配器可以创建Mp3的实例
     * 即可以实现不同于原Mp3播放音乐的方法，无需再继承Mp3类。
     */
    private Mp3 mp3;

    public BaoFengPlayer(Mp3 mp3) {
        this.mp3 = mp3;
    }

    @Override
    public void playMvs() {
        System.out.println("暴风影音实现播放MV的功能");
    }

    @Override
    public void playMusics() {
        mp3.playMusics();
    }

    @Override
    public void playMovies() {
        System.out.println("暴风影音实现播放电影的功能");
    }

    public Mp3 getMp3() {
        return mp3;
    }

    public void setMp3(Mp3 mp3) {
        this.mp3 = mp3;
    }
}
