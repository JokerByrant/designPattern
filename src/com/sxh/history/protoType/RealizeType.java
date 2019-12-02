package com.sxh.history.protoType;

/**
 * 原型模式（继承Cloneable接口）
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class RealizeType implements Cloneable{
    private String name;

    RealizeType(String name) {
        this.name = name;
        System.out.println("原型创建成功！");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功！");
        return (RealizeType)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RealizeType{" +
                "name='" + name + '\'' +
                '}';
    }
}
