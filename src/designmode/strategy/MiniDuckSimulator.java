package designmode.strategy;

import designmode.strategy.behavior.FlyRocketPowered;
import designmode.strategy.duckentity.Duck;
import designmode.strategy.duckentity.MallardDuck;
import designmode.strategy.duckentity.ModelDuck;

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
