package designmode.structural_mode.adapter.ducksample;

/**
 * @Author: dyf
 * @Date: 2019/6/3 22:27
 * @Description:
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("鸭子起飞了");
    }

}
