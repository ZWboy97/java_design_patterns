package strategy_pattern.ducks;

import strategy_pattern.BaseDuck;
import strategy_pattern.flybehaviors.FastFlyBehavior;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 11:20
 */
public class FastDuck extends BaseDuck {


    public FastDuck(String name) {
        super(name);
        flyBehavior = new FastFlyBehavior();
    }

}
