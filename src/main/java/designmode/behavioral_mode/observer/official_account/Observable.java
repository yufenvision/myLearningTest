package designmode.behavioral_mode.observer.official_account;

/**
 * @Author: dyf
 * @Date: 2020/4/8 10:04
 * @Description:
 * 抽象被观察者接口（被监听者）
 * 声明了添加、删除、通知观察者方法
 */
public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
