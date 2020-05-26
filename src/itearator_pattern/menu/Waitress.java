package itearator_pattern.menu;

import java.util.Iterator;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 22:45
 */
public class Waitress {

    private FirstMenu firstMenu;

    private SecondMenu secondMenu;

    public Waitress(FirstMenu firstMenu, SecondMenu secondMenu) {
        this.firstMenu = firstMenu;
        this.secondMenu = secondMenu;
    }



    public void print(){
        Iterator iterator = this.firstMenu.createIteartor();
        MyIterator myIterator = this.secondMenu.createIteartor();
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName()+","+item.getDesc());
        }
        while (myIterator.hasNext()){
            MenuItem item = (MenuItem)myIterator.next();
            System.out.println(item.getName()+","+item.getDesc());
        }
    }
}
