package designmode.factory.pizza;

/**
 * @Author: dyf
 * @Date: 2019/6/6 15:21
 * @Description:
 */
public abstract class Pizza {
    protected String pizzaName;

    public Pizza() {
    }

    public void prepare(){
        System.out.println("准备材料");
    }

    public void bake(){
        System.out.println("烘烤");
    }

    public void cut(){
        System.out.println("切片");
    }

    public void box(){
        System.out.println(pizzaName + "装盒");
    }

}
