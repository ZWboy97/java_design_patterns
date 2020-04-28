package observer_pattern.observers;

import observer_pattern.Observer;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 19:33
 */
public class FirstObserver implements Observer {

    @Override
    public void update(Object data) {
        System.out.println("FirstObserver：我接收到数据了，数据为" + data);
    }
}
