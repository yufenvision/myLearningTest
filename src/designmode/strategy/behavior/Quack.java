package designmode.strategy.behavior;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:15
 * @Description:
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫");
    }
}
