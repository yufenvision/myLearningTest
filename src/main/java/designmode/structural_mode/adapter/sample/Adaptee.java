package designmode.structural_mode.adapter.sample;

/**
 * @Author: dyf
 * @Date: 2021/1/6 22:47
 * @Description: 已经存在的接口，这个接口需要配置
 */
public class Adaptee {

    public void businessRequest(String business){
        System.out.println(business);
        System.out.println("我是已存在的业务代码....");
    }
}
