package com.sxh.newfolder.DP6_适配器模式.DP6;

/**
 * Mp3播放器 === 功能单一，只有播放音乐的功能（当然还能看小说hhh）
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class Mp3 {
    // 播放器的型号
    private String name = "";

    public Mp3(String name) {
        this.name = name;
    }

    public Mp3() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusics() {
        System.out.println("Mp3 -- " + this.name + "播放歌曲");
    }
}
