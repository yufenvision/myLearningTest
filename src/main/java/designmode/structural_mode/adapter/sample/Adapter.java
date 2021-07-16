package designmode.structural_mode.adapter.sample;

/**
 * @Author: dyf
 * @Date: 2021/1/6 23:10
 * @Description: 适配器类
 */
public class Adapter implements Target {

    //持有需要被适配的接口对象
    private Adaptee adaptee;

    //构造方法，传入需要被适配的对象
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request(String request) {
        adaptee.businessRequest(request);
    }
}
