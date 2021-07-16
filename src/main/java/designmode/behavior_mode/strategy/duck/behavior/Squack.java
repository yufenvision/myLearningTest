package designmode.behavior_mode.strategy.duck.behavior;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:15
 * @Description:
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("另外的一种呱呱叫");
    }
}
