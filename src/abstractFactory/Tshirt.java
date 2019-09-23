package abstractFactory;

/**
 * T恤
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Tshirt implements Clothes {
    @Override
    public void show() {
        System.out.println("我是一件T恤！");
    }
}
