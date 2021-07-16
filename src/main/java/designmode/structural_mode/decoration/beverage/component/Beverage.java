package designmode.structural_mode.decoration.beverage.component;

/**
 * @Author: dyf
 * @Date: 2019/6/2 10:28
 * @Description: 抽象组件
 *
 * 装饰者模式动态的将责任附加到对象上，如要扩展此功能，装饰者提供了比继承更有弹性的替代方案
 * 1、装饰者和被装饰对象有相同的超类型
 * 2、你可以用一个或多个装饰者包装一个对象。
 * 3、既然装饰者和被装饰对象有相同的超类型，所以在任何需要原始对象（被包装的）的场合，可以用装饰过的对象代替它。
 * 4、“！===== 装饰者可以在所委托被装饰者的行为之前与/或之后，加上自己的行为，以达到特定的目的 =====!”。
 * 5、对象可以在任何时候被装饰，所以可以在运行时动态地，不限量地用你喜欢的装饰者来装饰对象。
 */
public abstract class Beverage {

    protected String description = "我只是一杯饮料...";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

    //其它有用的方法...
}
