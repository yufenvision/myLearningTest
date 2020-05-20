package designmode.strategy.duck.duckentity;

import designmode.strategy.duck.behavior.FlyWithWings;
import designmode.strategy.duck.behavior.Quack;

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
