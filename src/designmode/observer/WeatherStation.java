package designmode.observer;

/**
 * @Author: dyf
 * @Date: 2019/5/29 22:38
 * @Description:
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();//创建一个weather对象
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        //第二个布告显示板...
        //第三个布告显示板...
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
