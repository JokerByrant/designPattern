package abstractFactory;

/**
 * 卫衣
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class SweaterClothes implements Clothes {
    @Override
    public void show() {
        System.out.println("我是一件卫衣！");
    }
}
