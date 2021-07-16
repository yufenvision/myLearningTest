package designmode.behavior_mode.observer.official_account;

/**
 * @Author: dyf
 * @Date: 2020/4/8 10:06
 * @Description:
 * 抽象观察者（监听器）
 * 定义了一个update()方法，当被观察者调用notifyObservers方法时，观察者的update()方法会被回调
 */
public interface Observer {
    void update(String message);
}
