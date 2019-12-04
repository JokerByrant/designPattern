package com.sxh.newfolder.DP6_适配器模式;

import com.sxh.newfolder.DP6_适配器模式.DP6.Mp3;
import com.sxh.newfolder.DP6_适配器模式.DP6.Player;
import com.sxh.newfolder.DP6_适配器模式.DP6.对象适配器.BaoFengPlayer;
import com.sxh.newfolder.DP6_适配器模式.DP6.接口适配器.APlayer;
import com.sxh.newfolder.DP6_适配器模式.DP6.接口适配器.AbstractPlayer;
import com.sxh.newfolder.DP6_适配器模式.DP6.接口适配器.BPlayer;
import com.sxh.newfolder.DP6_适配器模式.DP6.接口适配器.CPlayer;
import com.sxh.newfolder.DP6_适配器模式.DP6.类适配器.QQPlayer;

/**
 * @author 一池春水倾半城
 * @date 2019/12/4
 */
public class AdapterTest {
    public static void main(String[] args) {
        classAdapter();
        objectAdapter();
        interfaceAdapter();

        /**
         * 类适配器:当一个类A想拥有某个接口I里的所有功能时，却又懒得实现接口中的M方法时
         *        则可以专门定义一个类B，B中的方法和接口I中的M方法保持一致，只不过B中的M方法已经通过定制进行了功能实现
         *        这时候，我们称B是一个待适配的类，而B中的M方法我们称原方法，接口I中的M方法称作目标方法
         *        A类我们则称呼为真正要适配的类，这个类通过继承B类、实现接口I即可具有目标接口I中的所有功能
         *        正如一开始说的，适配的类A,懒得实现接口I中的M方法，怎么办，那我们就专门给A开个小灶，交给B类来做就好了
         *
         * 对象适配器:其实和类适配器差不多，唯一的区别就是，类适配器无法对B类进行实例化，不够灵活，而对象适配器中
         *         则将B类的实例放在了真正适配的类中，不管是内部还是外部，都可以实例化B对象，实现不同B对象的原始方法
         *
         * 接口适配器:类适配和对象适配器有个不好的地方就是，适配器对象必须实现接口I中的所有功能
         *         但现实是，我有时候不太想要I中的某些功能，怎么办？
         *         比如A对象只实现I中的M方法，B对象只实现I中的N方法，而C对象则全部实现I中的M、N、P方法
         *         这时候就需要借助抽象类Ab了，Ab实现接口I，抽象类和接口的区别就是，抽象类中的方法无需都实现，
         *         而接口中的方法必须全部实现，这样一来，我们适配的类就可以通过只继承Ab类来实现接口I中的部分功能了
         *
         *       项目中，具体用到哪种模式的适配器，可以好好斟酌一下了
         *
         */
    }

    /**
     * 类适配器
     */
    private static void classAdapter() {
        // 类适配器测试 === 持有类Mp3的原始方法，但不能创建Mp3类的实例
        Player qqPlayer = new QQPlayer();
        qqPlayer.playMovies();
        qqPlayer.playMvs();
        qqPlayer.playMusics();
        System.out.println("===========================================================");
    }

    /**
     * 对象适配器
     */
    private static void objectAdapter() {
        // 对象适配器 === 持有Mp3的原始方法，但是可以创建不同的Mp3实例
        Mp3 sonyMp3 = new Mp3("索尼（SONY） NW-ZX300A");
        Player bfPlayer = new BaoFengPlayer(sonyMp3);
        bfPlayer.playMovies();
        bfPlayer.playMusics();
        bfPlayer.playMvs();

        System.out.println("=========================暴风影音升级======================");

        Mp3 newsMyMp3 = new Mp3("纽曼（Newsmy）F35");
        ((BaoFengPlayer)bfPlayer).setMp3(newsMyMp3);
        bfPlayer.playMovies();
        bfPlayer.playMusics();
        bfPlayer.playMvs();
        System.out.println("===========================================================");
    }

    /**
     * 接口适配器
     */
    private static void interfaceAdapter() {
        // 接口适配器 === 适配器无需实现接口中的所有方法，但需要借助一个抽象类进行过度
        AbstractPlayer aPlayer = new APlayer();
        aPlayer.show();

        AbstractPlayer bPlayer = new BPlayer();
        bPlayer.show();

        AbstractPlayer cPlayer = new CPlayer();
        cPlayer.show();
    }
}
