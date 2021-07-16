package designmode.behavioral_mode.command;

/**
 * @Author: dyf
 * @Date: 2019/6/4 23:17
 * @Description:
 */
public class LightCommand implements Command {
    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {//这个excute调用接收对象（我们正在控制电灯的）on方法
        light.on();
    }
}
