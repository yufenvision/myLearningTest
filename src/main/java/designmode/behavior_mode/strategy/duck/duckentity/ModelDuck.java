package designmode.behavior_mode.strategy.duck.duckentity;

import designmode.behavior_mode.strategy.duck.behavior.FlyNoWay;
import designmode.behavior_mode.strategy.duck.behavior.Quack;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:25
 * @Description:
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();//不会飞
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭子");
    }
}
