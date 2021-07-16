package designmode.behavior_mode.strategy.duck.duckentity;

import designmode.behavior_mode.strategy.duck.behavior.FlyWithWings;
import designmode.behavior_mode.strategy.duck.behavior.Quack;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:18
 * @Description:
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是一只野鸭子");
    }
}
