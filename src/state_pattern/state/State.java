package state_pattern.state;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/1 21:54
 */
public interface State {

    void insertMoney();

    void ejectMoney();

    void turnCrank();

    void dispatch();

}
