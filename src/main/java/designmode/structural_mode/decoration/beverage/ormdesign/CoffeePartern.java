package designmode.structural_mode.decoration.beverage.ormdesign;

/**
 * @Author: dyf
 * @Date: 2020/9/9 17:23
 * @Description:
 */
public class CoffeePartern {
    private String name;
    private Double cost;

    public CoffeePartern(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
