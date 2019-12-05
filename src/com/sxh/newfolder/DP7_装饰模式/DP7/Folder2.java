package com.sxh.newfolder.DP7_装饰模式.DP7;

/**
 * @author 一池春水倾半城
 * @date 2019/12/5 23:14
 */
public class Folder2 implements Folder{
    @Override
    public void mkDir() {
        System.out.println("系统创建文件夹B");
    }

    @Override
    public void rmDir() {
        System.out.println("系统删除文件夹B");
    }
}
