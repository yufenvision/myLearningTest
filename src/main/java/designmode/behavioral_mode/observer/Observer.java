package designmode.behavioral_mode.observer;

/**
 * @Author: dyf
 * @Date: 2019/5/29 22:07
 * @Description: 抽象观察者
 */
public interface Observer {
    /*
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure  压力
     * @return: void
     * @Author: dyf
     * @Date: 2020/4/8 9:38
    */
    void update(float temp, float humidity, float pressure);
}
