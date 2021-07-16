package designmode.behavioral_mode.observer.jdkobserverable;

import designmode.behavioral_mode.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: dyf
 * @Date: 2019/5/30 22:23
 * @Description: 观察者
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前温度状态：" + temperature + "F degresss" + humidity + "%压力");
    }
}
