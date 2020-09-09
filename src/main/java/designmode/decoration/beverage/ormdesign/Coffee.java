package designmode.decoration.beverage.ormdesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: dyf
 * @Date: 2020/9/9 17:23
 * @Description:
 */
public class Coffee {
    private String name;
    private Double cost;
    List<CoffeePartern> coffeeParterns = Collections.emptyList();

    public Coffee(String name, Double cost, List<CoffeePartern> coffeeParterns) {
        this.name = name;
        this.cost = cost;
        this.coffeeParterns = coffeeParterns == null ? this.coffeeParterns : coffeeParterns;
    }

    public Coffee() {
    }

    public String getDecirpt(){
        StringBuilder sb = new StringBuilder(this.name);
        coffeeParterns.forEach(v -> sb.append(" + ").append(v.getName()));
        return sb.toString();
    }


    public Double getPrice(){
        Double price = this.cost;
        for (CoffeePartern coffeePartern : coffeeParterns) {
            price += coffeePartern.getCost();
        }
        return  price;
    }

    public static void main(String[] args){
        CoffeePartern mocha = new CoffeePartern("摩卡", .20D);
        CoffeePartern soy = new CoffeePartern("豆浆", .15D);
        CoffeePartern whip = new CoffeePartern("奶泡", .30D);
        Coffee darkRoast = new Coffee("深度烘焙咖啡", 2.14D, Arrays.asList(mocha, soy, whip ,whip));
        Coffee espresso = new Coffee("浓缩咖啡", 1.99D, Arrays.asList(soy, whip));
        Coffee houseBlend = new Coffee("House Blend 咖啡", 0.89D, null);
        System.out.format("%s : %.2f $\n",darkRoast.getDecirpt(), darkRoast.getPrice());
        System.out.format("%s : %.2f $\n",espresso.getDecirpt(), espresso.getPrice());
        System.out.format("%s : %.2f $\n",houseBlend.getDecirpt(), houseBlend.getPrice());

    }
}
