package designmode.observer;

/**
 * @Author: dyf
 * @Date: 2019/5/29 22:38
 * @Description: 出版者+订阅者 = 观察者模式
 * 建立一个应用，有三种布告板，分别显示目前状况、气象统计及简单的预报。当WeatherObject对象获得最新的测量数据时，三种布告板必须实时更新。
 * 而且，这是一个可以扩展的气象站，Weather-O-Rama气象站希望公布一组API,好让其它开发人员可以写出自己的气象布告板，并插入此应用中。我们希望贵公司能提供这样的API
 * Weather-O-Rama气象站有很好的商业营运模式，一旦客户上钩，他们使用每个布告板都要付钱。
 *
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
