package com.sxh.newfolder.DP4_原型模式;

import com.sxh.newfolder.DP4_原型模式.DP4.HomeWork;
import com.sxh.newfolder.DP4_原型模式.DP4.SexEnum;
import com.sxh.newfolder.DP4_原型模式.DP4.Student;
import com.sxh.newfolder.DP4_原型模式.DP4.SubjectType;
import com.sxh.utils.DateUtils;

import java.util.Date;

/**
 * @author 一池春水倾半城
 * @date 2019/12/3
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 原型 == 我们创建一个已经由小学生【刘晓然】完成的作业对象
        HomeWork homeWork = new HomeWork();
        // 设置作业信息
        homeWork.setSubjectType(SubjectType.WULI);
        homeWork.setTotalPage(12);
        homeWork.setFinishTime(new Date());
        // 设置小学生信息 == 刘晓然
        Student student  = new Student();
        student.setsNo(1001L);
        student.setsName("刘晓然");
        student.setAge(10);
        student.setSex(SexEnum.FEMALE);
        student.setsClass(4);
        homeWork.setStudent(student);

        // 1、原型模式第一种 == 作业对象浅拷贝测试
        HomeWork ykHomeWork = shallowCopy(homeWork);
        System.out.println("刘晓然的作业：\n"+homeWork);
        System.out.println("我的作业：\n"+ykHomeWork);

        /**
         * 以上输出结果为：
         * 刘晓然的作业：
         * 类型：物理,页数：12,完成时间：2018年11月08日 14时03分45秒,完成者：Appleyk,学号：1002,年级：4,年龄:10,性别：男
         * 我的作业：
         * 类型：物理,页数：12,完成时间：2018年11月09日 14时03分45秒,完成者：Appleyk,学号：1002,年级：4,年龄:10,性别：男
         *
         * 纳尼？？?
         * 老师："刘晓然同学，你说，你作业是不是抄别人的？为什么你的作业和Appleyk同学的作业一模一样！！！"
         * 刘晓然："老师，我自己做的，我没有抄啊，哭哭哭......"
         * Appleyk："我去，这，什么情况？我不是都改了吗，啊啊啊啊啊......"
         */


        // 2、原型模式第二种 == 作业对象深拷贝测试
        System.out.println("=========================================分割线");

        /**
         * 假设有第三个同学，要抄作业，这个同学假设叫"张聪明"
         * 他怎么聪明呢？我们看下面的案列
         */

        HomeWork zhangHomeWork = deepCopy(ykHomeWork);
        System.out.println("Appleyk的作业：\n"+ykHomeWork);
        System.out.println("张聪明的作业：\n"+zhangHomeWork);

        /**
         * 以上输出结果为：
         * Appleyk的作业：
         * 类型：物理,页数：12,完成时间：2018年11月09日 14时16分11秒,完成者：Appleyk,学号：1002,年级：4,年龄:10,性别：男
         * 张聪明的作业：
         * 类型：物理,页数：12,完成时间：2018年11月09日 14时16分11秒,完成者：张聪明,学号：1003,年级：4,年龄:10,性别：男
         *
         *
         * 老师："张聪明同学，你的作业完成的很棒吗！"
         * 张聪明："哈哈，果然这种抄作业的方式很完美，完全没有漏洞"
         * 老师："刘晓然和Appleyk，你们俩放学留一下，不讲清楚你俩作业怎么回事，我就叫你们家长过来！"
         * 刘晓然："老师，我是真没抄啊，我都不知道发生了什么啊，呜呜呜呜..."
         * Appleyk："卧槽，我再也不干这种伤天害理的事情了，我下一次一定要深度抄作业！！！！"
         */


        /**
         * 更多关于对象克隆的细节，请参考我的博文：https://blog.csdn.net/Appleyk/article/details/82866242
         */
    }

    /**
     * 对象浅拷贝
     * @param homeWork
     * @return
     */
    private static HomeWork shallowCopy(HomeWork homeWork) throws CloneNotSupportedException {
        /**
         *  独白：
         *  （1）复制一份【刘晓然】的作业
         *  （2）将复制过来的作业改成我自己的，记住，信息全改，不然被老师发现了，我还在"三好学生"堆里面怎么混
         *  （3）我以为自己耍了个小聪明，擅自改作业，却不知"尴尬"却正在发生....
         */
        HomeWork homeWork1 = homeWork.clone();
        homeWork1.setFinishTime(new Date());
        Student student = new Student();
        student.setsName("Sssxh");
        student.setSex(SexEnum.MALE);
        student.setsNo(1002L);
        student.setAge(18);
        homeWork1.setStudent(student);
        return homeWork1;
    }

    /**
     * 对象深度拷贝
     * @param homeWork
     * @return
     * @throws CloneNotSupportedException
     */
    public static  HomeWork deepCopy(HomeWork homeWork) throws  CloneNotSupportedException{

        /**
         *  独白：
         *  （1）复制一份【Appleyk】的作业
         *  （2）因为是深度拷贝，抄的比较认真，比较深，雪下的那么认真.....
         *  （3）因此，我完全不必担心，老师会发现端倪，哈哈哈哈哈哈.....
         */
        HomeWork myHomeWork = homeWork.deepClone();
        // 开始改造  == 首先改完成时间，完成时间+1天
        myHomeWork.setFinishTime(DateUtils.addDays(1));
        Student mySelf = myHomeWork.getStudent();
        mySelf.setsNo(1003L);
        mySelf.setsName("张聪明");
        mySelf.setSex(SexEnum.MALE);
        return  myHomeWork;
    }
}
