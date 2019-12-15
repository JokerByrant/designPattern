package com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.format;

import com.sxh.newfolder.DP8_桥接模式.DP_8.videoPlayer.platform.Platform;

/**
 * 视频格式抽象类
 * @author 一池春水倾半城
 * @date 2019/12/15 11:07
 */
public abstract class VideoFormat {
    // 播放平台
    private Platform platform;

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public abstract void playVideo();
}
