package com.sxh.newfolder.DP4_原型模式.DP4;

import java.io.*;
import java.util.Date;

/**
 * @author 一池春水倾半城
 * @date 2019/12/3
 */
public class HomeWork implements Cloneable, Serializable{
    private SubjectType subjectType = SubjectType.WULI;

    private Integer totalPage = 0;

    private Date finishTime;

    private Student student;

    @Override
    public String toString() {
        return "HomeWork{" +
                "subjectType=" + subjectType +
                ", totalPage=" + totalPage +
                ", finishTime=" + finishTime +
                ", student=" + student +
                '}';
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * 对象浅拷贝 ===> 对象中按值传递的都能完美的拷贝走，但是按引用传递的拷贝不走(指向的地址不变)
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public HomeWork clone() throws CloneNotSupportedException {
        return (HomeWork) super.clone();
    }

    /**
     * 深度拷贝 ===> 对象中不论是值类型还引用类型都一并拷贝走
     * 对象字节流的序列和反序列化
     * @return
     */
    public HomeWork deepClone() {

        // Anything 都是可以用字节流进行表示，记住是任何！
        HomeWork homeWork = null;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            // 将当前对象写入baos【输入流 --- 字节数组】里
            oos.writeObject(this);

            // 从输出字节数组缓冲当前字节流
            byte[] bytes = baos.toByteArray();

            // 创建一个输入字节数组缓冲区
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            // 创建一个对象输入流，读取字节数组缓冲区中的数据
            ObjectInputStream ois = new ObjectInputStream(bais);
            // 反序列化字节流 === 重新开辟一块空间存放反序列化字节流
            homeWork = (HomeWork) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return homeWork;
    }


}
