package designmode.structural_mode.decoration.beverage.concrete_decorator;

import designmode.structural_mode.decoration.beverage.component.Beverage;
import designmode.structural_mode.decoration.beverage.decorator.CondimentDecorator;

/**
 * @Author: dyf
 * @Date: 2019/6/2 11:29
 * @Description: 摩卡调料
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }
//    Beverage beverage;
//
//    public Mocha(Beverage beverage) {
//        this.beverage = beverage;
//    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + "，摩卡";
    }

    public double cost(){
        return beverage.cost() + .20;//要计算带Mocha饮料的价钱，首先把调用委托给被装饰对象，以计算价钱，然后再加上摩卡的价钱，得到最终结果
    }
}
