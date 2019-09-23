package singleton;

/**
 * 懒汉式，线程安全
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance = null;

    private LazySafeSingleton () {}

    // 增加线程锁
    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
