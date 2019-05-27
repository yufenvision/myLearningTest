package designmode.strategy.behavior;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:13
 * @Description:
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }
}
