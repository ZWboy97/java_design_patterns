package state_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/6/1 21:53
 */
public class main {

    public static void main(String[] args) throws Exception {
        Machine machine = new Machine(2);
        machine.insertMoney();
        machine.ejectMoney();

        machine.insertMoney();
        machine.turnCrank();
        machine.ejectMoney();
        machine.insertMoney();
        machine.dispatch();

        machine.insertMoney();
        machine.turnCrank();
        machine.dispatch();

        machine.insertMoney();


    }

}
