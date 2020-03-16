package designmode.strategy.duck;

import designmode.strategy.duck.behavior.FlyRocketPowered;
import designmode.strategy.duck.duckentity.Duck;
import designmode.strategy.duck.duckentity.MallardDuck;
import designmode.strategy.duck.duckentity.ModelDuck;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:16
 * @Description:
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck d = new MallardDuck();
        d.performQuack();
        d.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
