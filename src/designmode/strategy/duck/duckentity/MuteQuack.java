package designmode.strategy.duck.duckentity;

import designmode.strategy.duck.behavior.QuackBehavior;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:16
 * @Description:
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Slience>>安静");
    }
}
