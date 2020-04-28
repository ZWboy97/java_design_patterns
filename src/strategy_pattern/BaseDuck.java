package strategy_pattern;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 11:08
 */
public class BaseDuck {

    protected String name;

    protected FlyBehavior flyBehavior;


    public BaseDuck(String name) {
        this.name = name;
    }

    public void performSwim() {
        System.out.println(name + ": Look, I am swimming");
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
