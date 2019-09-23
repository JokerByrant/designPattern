package abstractFactory;

/**
 * Nike的加工厂
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class NikeFactory implements Factory {
    // 生产T恤
    @Override
    public Clothes produceClothes() {
        return new Tshirt();
    }

    // 生产运动鞋
    @Override
    public Shoes produceShoes() {
        return new SportShoes();
    }
}
