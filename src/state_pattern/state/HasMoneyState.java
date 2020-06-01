package state_pattern.state;

import state_pattern.Machine;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/1 22:03
 */
public class HasMoneyState implements State {

    private Machine machine;

    public HasMoneyState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("别，你以及投过钱了");
    }

    @Override
    public void ejectMoney() {
        System.out.println("好的，我这就把钱还给你");
        this.machine.setCurrentState(this.machine.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        System.out.println("好的，我马上把东西给你,进入售卖模式");
        this.machine.setCurrentState(this.machine.getSoldState());
    }

    @Override
    public void dispatch() {
        System.out.println("收到你的钱了，还没进售卖模式，再等等，等等");
    }
}
