package strategy_pattern.ducks;

import strategy_pattern.BaseDuck;
import strategy_pattern.flybehaviors.SlowFlyBehavior;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 11:23
 */
public class SlowDuck extends BaseDuck {

    public SlowDuck(String name) {
        super(name);
        flyBehavior = new SlowFlyBehavior();
    }
}
