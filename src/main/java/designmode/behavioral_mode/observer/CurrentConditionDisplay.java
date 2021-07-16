package designmode.behavioral_mode.observer;

/**
 * @Author: dyf
 * @Date: 2019/5/29 22:29
 * @Description:
 * 具体观察者
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度状态：" + temperature + "F degresss" + humidity + "%压力");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
