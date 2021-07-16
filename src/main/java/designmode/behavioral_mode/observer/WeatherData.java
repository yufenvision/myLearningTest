package designmode.behavioral_mode.observer;

import java.util.ArrayList;

/**
 * @Author: dyf
 * @Date: 2019/5/29 22:19
 * @Description:
 * 被观察者，气象数据采集服务器
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i > 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(v ->{
            ((Observer) v).update(temperature, humidity, pressure);
        });
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){//也可以实际的去调用外网数据，这里自己造的数据
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //WeatherData的其它方法
}
