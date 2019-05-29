package designmode.observer;

/**
 * @Author: dyf
 * @Date: 2019/5/29 22:07
 * @Description: 观察者
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
