package state_pattern.state;

import state_pattern.Machine;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/1 22:07
 */
public class SoldState implements State {

    private Machine machine;

    public SoldState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("正在卖东西，等等再投币");
    }

    @Override
    public void ejectMoney() {
        System.out.println("订单已经生效，没法退钱了");
    }

    @Override
    public void turnCrank() {
        System.out.println("你已经扭动过拨杆了，等货物吧");
    }

    @Override
    public void dispatch() {
        System.out.println("出货啦，请取走你的获取");
        int count = this.machine.getCount();
        count--;
        if(count == 0){
            this.machine.setCurrentState(this.machine.getSoudOutState());
        }else{
            this.machine.setCount(count);
            this.machine.setCurrentState(this.machine.getNoMoneyState());
        }
    }
}
