package builder.builder2;

/**
 * 项目经理
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class ProjectManager {
    // 指定装修工人
    private Decorator decorator;
    public ProjectManager(Decorator decorator){
        this.decorator = decorator;
    }

    // 指挥装修工人装修的内容
    public LivingRoom decorate() {
        decorator.buildWall();
        decorator.buildSofa();
        decorator.buildTV();
        return decorator.getLivingRoom();
    }
}
