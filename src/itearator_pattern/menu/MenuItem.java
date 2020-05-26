package itearator_pattern.menu;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 21:00
 */
public class MenuItem {

    private String name;
    private String desc;

    public MenuItem(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
