package builder.builder2;

/**
 * 客厅
 * @author 一池春水倾半城
 * @date 2019/9/23
 */
public class LivingRoom {
    // 墙
    private String wall;
    // 电视
    private String TV;
    // 沙发
    private String sofa;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "wall='" + wall + '\'' +
                ", TV='" + TV + '\'' +
                ", sofa='" + sofa + '\'' +
                '}';
    }
}
