package designmode.adapter.sample;

/**
 * @Author: dyf
 * @Date: 2021/1/6 23:12
 * @Description:
 */
public class ClientTest {

    public static void main(String[] args) {

        //创建需要被适配的对象
        Adaptee adaptee = new Adaptee();

        //创建客户端调用需要的接口对象
        Target target = new Adapter(adaptee);

        target.request("被适配的目标对象");

    }


}
