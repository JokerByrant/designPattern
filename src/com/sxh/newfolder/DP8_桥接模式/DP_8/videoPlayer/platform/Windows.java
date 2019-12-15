package com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.platform;

/**
 * @author 一池春水倾半城
 * @date 2019/12/15 11:07
 */
public class Windows implements Platform {
    @Override
    public void playVideo(String format) {
        System.out.println("在Windows下播放视频，格式是：" + format);
    }
}
