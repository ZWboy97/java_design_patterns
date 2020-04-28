package strategy_pattern;

import strategy_pattern.ducks.AutoDuck;
import strategy_pattern.ducks.FastDuck;
import strategy_pattern.ducks.SlowDuck;
import strategy_pattern.flybehaviors.FastFlyBehavior;
import strategy_pattern.flybehaviors.SlowFlyBehavior;

/**
 * @Author: LiJiaChang
 * @Date: 2020/4/28 11:06
 */
public class main {
    public static void main(String [] args) throws Exception{
        FastDuck fastDuck = new FastDuck("FastDuck");
        SlowDuck slowDuck = new SlowDuck("SlowDuck");
        AutoDuck autoDuck = new AutoDuck("AutoDuck");

        System.out.println("--------FastDuck---------");
        fastDuck.performFly();
        fastDuck.performSwim();

        System.out.println("--------SlowDuck---------");
        slowDuck.performFly();
        slowDuck.performSwim();

        System.out.println("--------AutoDuck with Fast Fly---------");
        autoDuck.setFlyBehaviorDelegate(new FastFlyBehavior());
        autoDuck.performFly();
        autoDuck.performSwim();

        System.out.println("--------AutoDuck change to Slow Fly---------");
        autoDuck.setFlyBehaviorDelegate(new SlowFlyBehavior());
        autoDuck.performFly();
        autoDuck.performSwim();


    }
}
