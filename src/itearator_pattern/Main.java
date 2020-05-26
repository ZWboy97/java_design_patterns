package itearator_pattern;

import itearator_pattern.menu.FirstMenu;
import itearator_pattern.menu.SecondMenu;
import itearator_pattern.menu.Waitress;

/**
 * @Author: LiJiaChang
 * @Date: 2020/5/26 20:57
 */
public class Main {

    public static void main(String [] args) throws Exception{

        FirstMenu firstMenu = new FirstMenu("First Menu");
        SecondMenu secondMenu = new SecondMenu("Second Menu");
        Waitress waitress = new Waitress(firstMenu,secondMenu);
        waitress.print();
    }
}
