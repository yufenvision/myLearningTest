package designmode.construct_mode.decoration.beverage.decorator;

import designmode.construct_mode.decoration.beverage.component.Beverage;

/**
 * @Author: dyf
 * @Date: 2019/6/2 11:17
 * @Description: 装饰器
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getDescription();//所有的调料装饰者都必须重新实现getDescription()方法

    @Override
    public double cost() {
        return 0;
    }
}
