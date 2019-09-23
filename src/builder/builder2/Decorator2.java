package builder.builder2;

/**
 * 装修工人1
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class Decorator2 extends Decorator{
    @Override
    void buildWall() {
        livingRoom.setWall("w2");
    }

    @Override
    void buildTV() {
        livingRoom.setTV("tv2");
    }

    @Override
    void buildSofa() {
        livingRoom.setSofa("sofa2");
    }
}
