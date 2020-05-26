package itearator_pattern.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 21:10
 */
public class SecondMenu {
    private MenuItem []items;
    private String name;

    public SecondMenu(String name) {
        this.name = name;
        items = new MenuItem[2];
        items[0] = new MenuItem("aaa","I am from Second Menu");
        items[1] = new MenuItem("bbb","I am from Second Menu, too");
    }

    public MyIterator createIteartor(){
        return new MyIterator(this.items);
    }
}
