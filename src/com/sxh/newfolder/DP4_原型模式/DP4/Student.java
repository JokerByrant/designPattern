package com.sxh.newfolder.DP4_原型模式.DP4;

/**
 * @author 一池春水倾半城
 * @date 2019/12/3
 */
public class Student {
    private String sName;
    private Long sNo;
    private Integer sClass;
    private SexEnum sex = SexEnum.MALE;
    private Integer age;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
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

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sNo=" + sNo +
                ", sClass=" + sClass +
                ", sex=" + sex.getName() +
                ", age=" + age +
                '}';
    }
}
