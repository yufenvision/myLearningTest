package designmode.factory.pizza.simplepizza_factory;

import designmode.factory.pizza.CheesePizza;
import designmode.factory.pizza.PepperoniPizza;
import designmode.factory.pizza.Pizza;
import designmode.factory.pizza.Veggie;

/**
 * @Author: dyf
 * @Date: 2019/6/6 15:21
 * @Description:
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza;
        switch (type){
            case "1" : pizza = new CheesePizza();break;
            case "2" : pizza = new PepperoniPizza();break;
            case "3" : pizza = new Veggie();break;
            default:
                pizza = new CheesePizza();
        }
        return pizza;
    }
}
