package strategy_pattern.ducks;

import strategy_pattern.BaseDuck;
import strategy_pattern.FlyBehavior;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 11:23
 */
public class AutoDuck extends BaseDuck {

    public AutoDuck(String name) {
        super(name);
    }

    public void setFlyBehaviorDelegate(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
