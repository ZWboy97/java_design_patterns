package state_pattern.state;

import state_pattern.Machine;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/1 22:10
 */
public class SoudOutState implements State {

    private Machine machine;

    public SoudOutState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("我没货了，不要给我投币了");
    }

    @Override
    public void ejectMoney() {
        System.out.println("我不会收你的币，怎么可能欠你的钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("没货了，扳动拨杆也没有");
    }

    @Override
    public void dispatch() {
        System.out.println("没货了，不会收你钱，更不会给你货物");
    }
}
