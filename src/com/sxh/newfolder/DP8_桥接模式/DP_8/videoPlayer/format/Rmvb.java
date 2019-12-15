package com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.format;

/**
 * @author 一池春水倾半城
 * @date 2019/12/15 11:17
 */
public class Rmvb extends VideoFormat {
    @Override
    public void playVideo() {
        getPlatform().playVideo("rmvb");
    }
}
