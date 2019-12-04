package com.sxh.newfolder.DP6_适配器模式.DP6.类适配器;

import com.sxh.newfolder.DP6_适配器模式.DP6.Mp3;
import com.sxh.newfolder.DP6_适配器模式.DP6.Player;

/**
 * 类适配器 === 将Mp3播放音乐的功能直接拓展到播放器中，就不用再播放器播放音乐的功能了
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class QQPlayer extends Mp3 implements Player {

    @Override
    public void playMvs() {
        System.out.println("QQ Player 实现播放MV的功能！");
    }

    @Override
    public void playMovies() {
        System.out.println("QQ Player 实现播放电影的功能！");
    }
}
