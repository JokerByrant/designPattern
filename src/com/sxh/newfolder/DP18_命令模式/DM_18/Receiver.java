package com.sxh.newfolder.DP18_命令模式.DM_18;

/**
 * 命令接收者
 * @author sxh
 * @date 2020/1/20
 */
public class Receiver {

    /**
     * 真正执行命令的人
     */
    private String name;

    public Receiver(String name) {
        this.name = name;
    }

    /**
     * 执行命令
     * @param command
     */
    public void action(String command) {
        System.out.println("接收者：" + name + "，命令【" + command + "】\n 得令！");
    }
}
