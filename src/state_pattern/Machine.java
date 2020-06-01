package state_pattern;

import state_pattern.state.*;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/1 21:59
 */
public class Machine {

    NoMoneyState noMoneyState;
    HasMoneyState hasMoneyState;
    SoldState soldState;
    SoudOutState soudOutState;
    State currentState;
    private int count;

    public Machine(int count) {
        this.count = count;
        this.noMoneyState = new NoMoneyState(this);
        this.hasMoneyState = new HasMoneyState(this);
        this.soldState = new SoldState(this);
        this.soudOutState = new SoudOutState(this);
        this.currentState = noMoneyState;
    }

    void insertMoney() {
        currentState.insertMoney();
    }

    void ejectMoney() {
        currentState.ejectMoney();
    }

    void turnCrank() {
        currentState.turnCrank();
    }

    void dispatch() {
        currentState.dispatch();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public NoMoneyState getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(NoMoneyState noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public HasMoneyState getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(HasMoneyState hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public void setSoldState(SoldState soldState) {
        this.soldState = soldState;
    }

    public SoudOutState getSoudOutState() {
        return soudOutState;
    }

    public void setSoudOutState(SoudOutState soudOutState) {
        this.soudOutState = soudOutState;
    }
}
