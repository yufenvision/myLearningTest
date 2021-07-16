package designmode.behavioral_mode.strategy.duck.duckentity;

import designmode.behavioral_mode.strategy.duck.behavior.QuackBehavior;

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
