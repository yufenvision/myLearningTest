package designmode.structural_mode.proxy.jdk.staticproxy;

/**
 * @Author: dyf
 * @Date: 2020/5/19 17:40
 * @Description:
 */
public class MainTest {

    public static void main(String[] args){
        StaticProxy staticProxy = new StaticProxy(new Landlord());
        staticProxy.say("我要卖房子了");
    }

}
