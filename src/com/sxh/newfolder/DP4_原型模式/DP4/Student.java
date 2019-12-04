package com.sxh.newfolder.DP4_原型模式.DP4;

import java.io.Serializable;

/**
 * 学生
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class Student implements Serializable{
    // 姓名
    private String sName;

    // 年龄
    private Integer age;

    // 性别
    private SexEnum sex = SexEnum.MALE;

    // 学号
    private Long sNo;

    // 班级
    private Integer sClass;

    public Student(String sName, Integer age, SexEnum sex, Long sNo, Integer sClass) {
        this.sName = sName;
        this.age = age;
        this.sex = sex;
        this.sNo = sNo;
        this.sClass = sClass;
    }

    public Student() {
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Long getsNo() {
        return sNo;
    }

    public void setsNo(Long sNo) {
        this.sNo = sNo;
    }

    public Integer getsClass() {
        return sClass;
    }

    public void setsClass(Integer sClass) {
        this.sClass = sClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", age=" + age +
                ", sex=" + sex.getName() +
                ", sNo=" + sNo +
                ", sClass=" + sClass +
                '}';
    }
}
