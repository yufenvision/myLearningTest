package designmode.construct_mode.decoration.beverage.concrete_component;

import designmode.construct_mode.decoration.beverage.component.Beverage;

/**
 * @Author: dyf
 * @Date: 2019/6/2 11:28
 * @Description:
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "深度烘焙咖啡";
    }

    @Override
    public double cost() {
        return 2.14;
    }
}
