package designmode.behavior_mode.observer;

/**
 * @Author: dyf
 * @Date: 2020/4/8 14:35
 * @Description:
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    @Override
    public void display() {
        System.out.println("可以显示计算的平均温度，湿度，等等.....");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}
