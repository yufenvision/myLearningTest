package designmode.strategy.duckentity;

import designmode.strategy.behavior.FlyWithWings;
import designmode.strategy.behavior.Quack;

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
