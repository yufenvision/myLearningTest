package designmode.behavior_mode.strategy.duck;

import designmode.behavior_mode.strategy.duck.behavior.FlyRocketPowered;
import designmode.behavior_mode.strategy.duck.duckentity.Duck;
import designmode.behavior_mode.strategy.duck.duckentity.MallardDuck;
import designmode.behavior_mode.strategy.duck.duckentity.ModelDuck;

/**
 * @Author: dyf
 * @Date: 2019/5/27 23:16
 * @Description:
 *
 * “有一个”关系相当有趣：每一鸭子都有一个FlyBehavior和一个QuackBehavior，好将飞行和呱呱叫委托给它们代为处理。
 * 当你将两个类结合起来用，如同本例一般，这就是组合。这种做法和“继承”不同的地方在于，鸭子的行为不是继承来的，而是和适当的行为对象“组装”来的。这个技巧是一个很重要的设计原则：多用组合，少用继承
 * 如你所见，使用组合建立系统具有很大的弹性，不仅可将算法族封装成类，更可以“在运行时动态地改变行为”，只要组合的行为对象符合正确的接口标准即可。
 *
 * 策略模式：定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
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
