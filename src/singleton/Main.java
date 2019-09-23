package singleton;

public class Main {

    public static void main(String[] args) {
        // 懒汉式
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l1 == l2);
    }
}
