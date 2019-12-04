package com.sxh.newfolder.DP4_原型模式;

import com.sxh.newfolder.DP4_原型模式.DP4.HomeWork;
import com.sxh.newfolder.DP4_原型模式.DP4.HomeWorkType;
import com.sxh.newfolder.DP4_原型模式.DP4.SexEnum;
import com.sxh.newfolder.DP4_原型模式.DP4.Student;
import com.sxh.utils.DateUtils;

import java.util.Date;

/**
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class ProtoTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 首先创建一份作业
        HomeWork homeWork = new HomeWork();
        homeWork.setType(HomeWorkType.HUAXUE);
        homeWork.setFinishTime(new Date());
        homeWork.setPage(12);
        // 创建完成人
        Student student = new Student("朱夏雨", 13, SexEnum.MALE, 1001L, 5);
        homeWork.setStudent(student);

        // 1、浅拷贝，sxh抄作业，首先复制一份作业，然后将朱夏雨的信息修改掉
        HomeWork sxhHomeWork = shallowCopy(homeWork);
        System.out.println("朱夏雨的作业：" + homeWork);
        System.out.println("sxh的作业：" + sxhHomeWork);

        System.out.println("=================================================================");

        // 2.深拷贝，李大头就比较聪明了，他用了深拷贝
        HomeWork liHomeWork = deepCopy(homeWork);
        System.out.println("朱夏雨的作业：" + homeWork);
        System.out.println("李大头的作业：" + liHomeWork);

    }

    /**
     * 抄作业，浅拷贝
     * @return
     */
    private static HomeWork shallowCopy(HomeWork homeWork) throws CloneNotSupportedException {
        HomeWork sxhHomeWork = homeWork.clone();
        // 修改完成时间
        sxhHomeWork.setFinishTime(DateUtils.addDays(1));
        // 名字不能忘记改
        sxhHomeWork.getStudent().setsName("sxh");
        // 年龄也的对上
        sxhHomeWork.getStudent().setAge(13);
        // 还有学号，改的彻底一点，不能被发现
        sxhHomeWork.getStudent().setsNo(1002L);
        return sxhHomeWork;
    }

    /**
     * 抄作业，深拷贝，隔壁班的李大头也想抄一份作业
     * @return
     */
    private static HomeWork deepCopy(HomeWork homeWork) throws CloneNotSupportedException {
        HomeWork sxhHomeWork = homeWork.deepClone();
        // 修改完成时间
        sxhHomeWork.setFinishTime(DateUtils.addDays(1));
        // 名字不能忘记改
        sxhHomeWork.getStudent().setsName("李大头");
        // 年龄也的对上
        sxhHomeWork.getStudent().setAge(13);
        // 还有学号，改的彻底一点，不能被发现
        sxhHomeWork.getStudent().setsNo(1003L);
        // 修改班级
        sxhHomeWork.getStudent().setsClass(2);
        return sxhHomeWork;
    }
}
