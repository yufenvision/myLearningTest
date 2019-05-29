package designmode.observer;

/**
 * @Author: dyf
 * @Date: 2019/5/29 22:06
 * @Description: 主题接口
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
