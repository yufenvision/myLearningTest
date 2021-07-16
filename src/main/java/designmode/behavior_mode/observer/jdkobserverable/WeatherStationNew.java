package designmode.behavior_mode.observer.jdkobserverable;

/**
 * @Author: dyf
 * @Date: 2019/5/30 22:28
 * @Description:
 */
public class WeatherStationNew {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,33, 32);

    }

}
