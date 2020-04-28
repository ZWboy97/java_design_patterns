package strategy_pattern.flybehaviors;

import strategy_pattern.FlyBehavior;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 11:18
 */
public class SlowFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Sorry, I am Fly So Slow!!");
    }
}
