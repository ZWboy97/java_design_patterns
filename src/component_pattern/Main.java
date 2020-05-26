package component_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 22:56
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu("All Menu");

        menu.add(new Item("AAA", "aaa"));
        menu.add(new Item("BBB", "bbb"));

        Menu subMenu = new Menu("Sub1");
        subMenu.add(new Item("CCC", "ccc"));
        subMenu.add(new Item("DDD", "ddd"));
        subMenu.add(new Item("EEE", "eee"));

        menu.add(subMenu);

        //menu.print();


        ComponentIterator iterator = new ComponentIterator(menu.components.iterator());
        while (iterator.hasNext()){
            MenuComponent component = (MenuComponent)iterator.next();
            component.print();
        }

    }
}
