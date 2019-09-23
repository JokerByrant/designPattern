package abstractFactory;

/**
 * 抽象工厂接口，用于生产衣服和鞋子
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public interface Factory {
    // 生产衣服
    Clothes produceClothes();

    // 生产鞋子
    Shoes produceShoes();
}
