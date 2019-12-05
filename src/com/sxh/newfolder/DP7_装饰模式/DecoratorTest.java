package com.sxh.newfolder.DP7_装饰模式;

import com.sxh.newfolder.DP7_装饰模式.DP7.Folder;
import com.sxh.newfolder.DP7_装饰模式.DP7.Folder1;
import com.sxh.newfolder.DP7_装饰模式.DP7.Folder3;
import com.sxh.newfolder.DP7_装饰模式.DP7.FolderDecorator;

/**
 * 装饰模式测试
 * @author 一池春水倾半城
 * @date 2019/12/5 23:17
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Folder folder1 = new Folder1();
        FolderDecorator folderDecorator = new FolderDecorator(folder1);
        folderDecorator.mkDir();
        folderDecorator.rmDir();

        System.out.println("=====================================");

        Folder folder2 = new Folder1();
        FolderDecorator folderDecorator2 = new FolderDecorator(folder1);
        folderDecorator2.mkDir();
        folderDecorator2.rmDir();

        System.out.println("======================================");

        Folder3 folder3 = new Folder3();
        folder3.mkDir();
        folder3.rmDir();

        /**
         * 好处：可以动态的拓展类的功能，原始的类功能无需修改，只需要新增一个装饰类就行了。
         * 坏处：如果一个类需要经过多次改动，而每次都新增一个装饰类来完成功能的拓展的话，长此以往会增加很多装饰类，这样会增加后期的代码阅读难度。
         *
         * 使用环境：1.类不能被继承(final类)
         *          2.需要动态的给一个对象增加功能，并且这些功能也能在后期被动态的撤销
         *          3.当使系统中存在大量独立的拓展，为支持这些组合将产生大量的子类(如本例，如果采用继承则需要新增两个子类分别继承Folder1和Folder2)
         */
    }
}
