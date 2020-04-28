package strategy_pattern.flybehaviors;

import strategy_pattern.FlyBehavior;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 11:16
 */
public class FastFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Look, I am Fly So Fast!!");
    }
}
