package designmode.behavior_mode.observer;

/**
 * @Author: dyf
 * @Date: 2019/5/29 22:06
 * @Description: 主题接口
 * 抽象被观察者
 */
public interface Subject {
    void registerObserver(Observer o);//观察者注册
    void removeObserver(Observer o);//观察者移除
    void notifyObservers();//观察者通知
}
