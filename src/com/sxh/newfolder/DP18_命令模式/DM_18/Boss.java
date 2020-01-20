package com.sxh.newfolder.DP18_命令模式.DM_18;

/**
 * 指挥官，命令发起人
 * @author sxh
 * @date 2020/1/20
 */
public class Boss {
    // 命令发起人
    private String name;

    // 具体待发送的命令
    private ICommand command;

    public Boss(ICommand command) {
        this.command = command;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action() {
        System.out.println("命令下达者：" + name);
        command.execute();
    }
}
