package designmode.behavioral_mode.strategy.duck.duckentity;

import designmode.behavioral_mode.strategy.duck.behavior.FlyBehavior;
import designmode.behavioral_mode.strategy.duck.behavior.QuackBehavior;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:05
 * @Description:
 */
public abstract class Duck {
    //行为变量被声明为行为“接口”类型
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    //从此以后我们可以随时调用这两个方法改变鸭子的行为
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();//委托给行为类
    }
    public void performQuack(){
        quackBehavior.quack();//委托给行为类
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
