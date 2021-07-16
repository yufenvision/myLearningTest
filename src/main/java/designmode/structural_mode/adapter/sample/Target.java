package designmode.structural_mode.adapter.sample;

/**
 * @Author: dyf
 * @Date: 2021/1/6 22:44
 * @Description: 定义客户端使用的接口，与业务相关
 */
public interface Target {

    //客户端请求处理的方法
    void request(String request);

}
