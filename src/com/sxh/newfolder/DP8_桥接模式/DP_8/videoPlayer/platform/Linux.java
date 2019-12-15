package com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.platform;

/**
 * @author 一池春水倾半城
 * @date 2019/12/15 11:06
 */
public class Linux implements Platform {
    @Override
    public void playVideo(String format) {
        System.out.println("在Linux上播放视频，格式是" + format);
    }
}
