package component_pattern;

import java.util.ArrayList;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 22:57
 */
abstract public class MenuComponent {

    ArrayList<MenuComponent> components;

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();

    }

    public void operation() {
        throw new UnsupportedOperationException();

    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();

    }

    public void print() {
        throw new UnsupportedOperationException();
    }

}
