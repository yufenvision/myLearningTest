package designmode.structural_mode.decoration.beverage;

import designmode.structural_mode.decoration.beverage.component.Beverage;
import designmode.structural_mode.decoration.beverage.concrete_component.DarkRoast;
import designmode.structural_mode.decoration.beverage.concrete_component.Espresso;
import designmode.structural_mode.decoration.beverage.concrete_decorator.Mocha;
import designmode.structural_mode.decoration.beverage.concrete_decorator.Soy;
import designmode.structural_mode.decoration.beverage.concrete_decorator.Whip;

/**
 * @Author: dyf
 * @Date: 2019/6/2 11:37
 * @Description:
 */
public class coffeeTest {

    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + "$" + beverage3.cost());

    }

}
