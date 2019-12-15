package com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.platform;

/**
 * 操作系统
 * @author 一池春水倾半城
 * @date 2019/12/15 11:05
 */
public interface Platform {
    /**
     * 播放视频
     * @param format 视频格式
     */
    public void playVideo(String format);
}
