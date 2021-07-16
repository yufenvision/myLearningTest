package designmode.construct_mode.adapter.ducksample;

/**
 * @Author: dyf
 * @Date: 2019/6/3 22:30
 * @Description: 适配器模式将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间
 */
public class TuekeyAdapter implements Duck {
    Turkey turkey;

    public TuekeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        int i = 5;
        while(i-- > 0){
            turkey.fly();
        }
    }
}
