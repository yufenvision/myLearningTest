package designmode.construct_mode.decoration.beverage.concrete_component;

import designmode.construct_mode.decoration.beverage.component.Beverage;

/**
 * @Author: dyf
 * @Date: 2019/6/2 11:19
 * @Description: 具体组件
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "浓缩咖啡";//为了要设置饮料的描述，我们写了一个构造器，记住,description实例变量继承自Beverage
    }

    @Override
    public double cost() {
        return 1.99;
    }//具体组件

}
