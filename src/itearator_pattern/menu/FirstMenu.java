package itearator_pattern.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 21:00
 */
public class FirstMenu {
    private ArrayList<MenuItem> items;
    private String name;

    public FirstMenu(String name) {
        this.name = name;
        items = new ArrayList<>();
        items.add(new MenuItem("AAA","I am from First Menu"));
        items.add(new MenuItem("BBB","I am from First Menu, too"));
    }

    public Iterator<MenuItem> createIteartor(){
        return items.iterator();
    }
}
