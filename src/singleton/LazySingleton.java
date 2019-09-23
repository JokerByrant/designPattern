package singleton;

/**
 * 懒汉式
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton () {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
