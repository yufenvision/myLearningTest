package designmode.structural_mode.decoration.beverage.concrete_decorator;

import designmode.structural_mode.decoration.beverage.component.Beverage;
import designmode.structural_mode.decoration.beverage.decorator.CondimentDecorator;

/**
 * @Author: dyf
 * @Date: 2019/6/2 11:36
 * @Description: 奶泡
 */
public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }
//    Beverage beverage;
//
//    public Whip(Beverage beverage) {
//        this.beverage = beverage;
//    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",奶泡";
    }

    public double cost(){
        return beverage.cost() + .30;
    }
}
