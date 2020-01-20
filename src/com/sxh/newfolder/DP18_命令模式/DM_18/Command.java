package com.sxh.newfolder.DP18_命令模式.DM_18;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class Command implements ICommand {
    private String command;

    // 接收人，对于命令的发出者来说，他不需要知道是谁接收了命令
    private Receiver receiver;

    public Command(String command, Receiver receiver) {
        this.command = command;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(command);
    }
}
