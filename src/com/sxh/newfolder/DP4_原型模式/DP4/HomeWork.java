package com.sxh.newfolder.DP4_原型模式.DP4;

import java.io.*;
import java.util.Date;

/**
 * 家庭作业
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class HomeWork implements Cloneable,Serializable{
    // 作业属于哪一门课
    private HomeWorkType type = HomeWorkType.SHUXUE;

    // 有多少页需要做
    private Integer page;

    // 完成时间
    private Date finishTime;

    // 作业是谁的
    private Student student;

    public HomeWorkType getType() {
        return type;
    }

    public void setType(HomeWorkType type) {
        this.type = type;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
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

    @Override
    public String toString() {
        return "HomeWork{" +
                "type=" + type.getName() +
                ", page=" + page +
                ", finishTime=" + finishTime +
                ", student=" + student +
                '}';
    }

    /**
     * 浅克隆，对象中传递值的对象能复制走，但按引用传递的就不行
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public HomeWork clone() throws CloneNotSupportedException {
        return (HomeWork) super.clone();
    }

    /**
     * 深克隆 === 对象中的一切都能完完全全的拷贝走
     * @return
     */
    public HomeWork deepClone() {
        HomeWork homeWork = null;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            // 从输出字节数组缓冲区拿到字节流
            byte[] bytes = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            homeWork = (HomeWork) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return homeWork;
    }
}
