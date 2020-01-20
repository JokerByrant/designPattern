package com.sxh.newfolder.DP18_命令模式;

import com.sxh.newfolder.DP18_命令模式.DM_18.Boss;
import com.sxh.newfolder.DP18_命令模式.DM_18.Command;
import com.sxh.newfolder.DP18_命令模式.DM_18.Receiver;

/**
 * @author sxh
 * @date 2020/1/20
 */
public class CommandTest {
    public static void main(String[] args) {
        command();
    }

    private static void command() {
        Receiver receiver = new Receiver("程序猿");
        Boss boss = new Boss(new Command("这个需求很简单，怎么实现我不管", receiver));
        boss.setName("产品经理");
        boss.action();
    }

    /**
     * 命令模式说白了就是一个BOSS下达命令，员工执行的过程。
     * 这个过程可以看做BOSS下达了一个命令，秘书拿着这个命令找到员工A，员工A收到命令开始执行。
     * 这里的Boss就是发起者，秘书可以看做是命令指派者，员工A则是命令执行人。
     */

    /**
     * @from: https://blog.csdn.net/appleyk
     * 某鸟教程如此描述命令模式：
     * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
     * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，
     * 并把该命令传给相应的对象，该对象执行命令。
     *
     * 短短几句话，是不是看得很懵逼，其实理解不难：
     * （1）得有请求吧，请求就是要干什么事情，不，是谁让谁来干什么事情
     * （2）第一个谁就是请求的发起者
     * （3）第二个谁就是请求的执行者
     * （4）其中事情，我们可以理解为命令
     * （5）发起者不需要关心执行者是谁，反正由我下发命令就行
     * （6）执行者，也没和发起者碰过面，不知道他长什么样，反正命令来了，我执行就是了
     * （7）ok，说明白了，其实这种模式就是为了将命令的发起者和执行者进行解耦
     * （8）解耦的方式，就是构建一个具体的命令类，持有接收者的对象
     * （9）同时，命令的发起者持有命令的具体实例，发起者通过执行命令实例的方法，从而触发具体的接收者来执行请求
     *
     *  以上综述，概况优缺点：
     *  优点：
     *  （1）降低系统的耦合度，使得发起者和执行者本来紧密的关系被抽离
     *  （2）比较容易扩展新的命令，只需要新建一个类，实现命令接口即可
     *  缺点：
     *  （1）由于扩展新的命令类比较容易，会导致系统产生过多的类，而过多的类会增加系统的维护成本及理解难度
     */
}
