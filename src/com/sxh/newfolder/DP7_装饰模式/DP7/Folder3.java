package com.sxh.newfolder.DP7_装饰模式.DP7;

/**
 * Folder3 === 继承Folder1，完成对其功能的拓展
 * @author 一池春水倾半城
 * @date 2019/12/5 23:21
 */
public class Folder3 extends Folder1 {
    @Override
    public void mkDir() {
        super.mkDir();
        System.out.println("再额外创建一个文件夹C");
    }

    @Override
    public void rmDir() {
        super.rmDir();
        System.out.println("再额外将文件夹C删除");
    }
}
