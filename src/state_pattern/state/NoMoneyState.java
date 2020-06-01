package state_pattern.state;

import state_pattern.Machine;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/1 21:58
 */
public class NoMoneyState implements State {

    private Machine machine;

    public NoMoneyState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Yes, I receive your money");
        this.machine.setCurrentState(this.machine.getHasMoneyState());

    }

    @Override
    public void ejectMoney() {
        System.out.println("Oh no, I do not have your money");

    }

    @Override
    public void turnCrank() {
        System.out.println("Are you kidding me?");

    }

    @Override
    public void dispatch() {
        System.out.println("You can not do this");
    }
}
