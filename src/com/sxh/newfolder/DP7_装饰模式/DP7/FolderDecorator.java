package com.sxh.newfolder.DP7_装饰模式.DP7;

/**
 * 文件装饰类
 * 拓展文件的创建和删除类
 * @author 一池春水倾半城
 * @date 2019/12/5 23:15
 */
public class FolderDecorator implements Folder{
    private Folder folder;

    public FolderDecorator(Folder folder) {
        this.folder = folder;
    }

    @Override
    public void mkDir() {
        System.out.println("检查是否存在相同名称的文件夹");
        folder.mkDir();
        System.out.println("文件夹创建成功！");
    }

    @Override
    public void rmDir() {
        System.out.println("检查文件夹是否存在");
        folder.rmDir();
        System.out.println("文件夹删除成功！");
    }
}
