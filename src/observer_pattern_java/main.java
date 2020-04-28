package observer_pattern_java;

import observer_pattern_java.obserables.MyObserable;
import observer_pattern_java.observers.MyObserver;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 19:43
 */
public class main {

    public static void main(String[] args) throws Exception {
        MyObserable myObserable = new MyObserable();

        MyObserver myObserver1 = new MyObserver("FirstObserver");
        MyObserver myObserver2 = new MyObserver("SecondObserver");

        myObserable.addObserver(myObserver1);
        myObserable.addObserver(myObserver2);

        myObserable.changeData("哈哈哈");

        System.out.println("移除第一个观察者");
        myObserable.deleteObserver(myObserver1);

        myObserable.changeData("呜呜呜");


    }

}
