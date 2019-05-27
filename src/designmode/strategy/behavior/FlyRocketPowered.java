package designmode.strategy.behavior;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:29
 * @Description:
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用火箭起飞");
    }
}
