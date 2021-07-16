package designmode.construct_mode.decoration.beverage.concrete_decorator;

import designmode.construct_mode.decoration.beverage.component.Beverage;
import designmode.construct_mode.decoration.beverage.decorator.CondimentDecorator;

/**
 * @Author: dyf
 * @Date: 2019/6/2 11:34
 * @Description: 豆浆
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }
//    Beverage beverage;
//
//    public Soy(Beverage beverage) {
//        this.beverage = beverage;
//    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",豆浆";
    }

    public double cost(){
        return beverage.cost() + .15;
    }
}
