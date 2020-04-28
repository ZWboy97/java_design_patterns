package observer_pattern_java.observers;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 19:47
 */
public class MyObserver implements Observer {

    private Observer observer;

    private String name = "";


    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object arg) {
        String data = (String) arg;
        System.out.println(name + "接收到消息：" + data);
    }
}
