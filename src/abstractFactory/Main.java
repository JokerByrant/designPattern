package abstractFactory;

/**
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Main {
    public static void main(String[] args) {
        // 构造一个耐克工厂
        Factory nikeFactory = new NikeFactory();
        nikeFactory.produceClothes().show();
        nikeFactory.produceShoes().show();

        // 构造一个Vans工厂
        Factory vansFactory = new VansFactory();
        vansFactory.produceShoes().show();
        vansFactory.produceClothes().show();
    }
}
