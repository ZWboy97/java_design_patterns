package component_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 23:02
 */
public class Item extends MenuComponent {

    private String name;
    private String desc;

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void operation() {
        System.out.println("item:"+this.name + "," + this.desc);
    }

    @Override
    public void print() {
        operation();
    }

    @Override
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
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
