package com.sxh.newfolder.DP11_外观模式.DP_11.ModuleB;

/**
 * 模块B下的子系统C
 * @author sxh
 * @date 2019/12/27
 */
public class SubSystemC {

    public void sayHello(){
        System.out.println("欢迎进入人工智能系统 =====>"+this);
        System.out.println("Welcome!");
    }
    @Override
    public String toString(){
        return "人工智能系统，模块B，子系统C，欢迎界面";
    }
}
