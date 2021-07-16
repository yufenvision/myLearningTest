package designmode.structural_mode.decoration.beverage.concrete_component;

import designmode.structural_mode.decoration.beverage.component.Beverage;

/**
 * @Author: dyf
 * @Date: 2019/6/2 11:22
 * @Description:
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend 咖啡";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
