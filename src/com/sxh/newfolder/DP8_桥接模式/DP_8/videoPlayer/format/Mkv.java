package com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.format;

/**
 * @author 一池春水倾半城
 * @date 2019/12/15 11:16
 */
public class Mkv extends VideoFormat {
    @Override
    public void playVideo() {
        getPlatform().playVideo("Mkv");
    }
}
