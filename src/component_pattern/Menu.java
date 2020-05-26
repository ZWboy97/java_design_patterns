package component_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 22:59
 */
public class Menu extends MenuComponent {

    private String name;

    public Menu(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent component) {
        this.components.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        this.components.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("This is menu, name = "+this.name);
    }


    @Override
    public void print() {
        Iterator iterator = this.components.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            component.operation();
        }
    }

    @Override
    public MenuComponent getChild(int index) {
        return this.components.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
