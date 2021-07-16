package designmode.behavior_mode.strategy.duck.behavior;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:14
 * @Description:
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
