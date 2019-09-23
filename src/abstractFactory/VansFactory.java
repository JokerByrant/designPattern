package abstractFactory;

/**
 * Vans加工厂
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class VansFactory implements Factory{

    // 生产卫衣
    @Override
    public Clothes produceClothes() {
        return new SweaterClothes();
    }

    // 生产帆布鞋
    @Override
    public Shoes produceShoes() {
        return new CanvasShoes();
    }
}
