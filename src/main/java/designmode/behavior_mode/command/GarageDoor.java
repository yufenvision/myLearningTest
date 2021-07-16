package designmode.behavior_mode.command;

/**
 * @Author: dyf
 * @Date: 2019/6/5 14:26
 * @Description:
 */
public class GarageDoor {
    public void up(){
        System.out.println("卷帘门向上");
    }
    public void down(){
        System.out.println("卷帘门向下");
    }
    public void stop(){
        System.out.println("卷帘门停止");
    }
    public void lightOn(){
        System.out.println("车库开灯");
    }

    public void lightOff(){
        System.out.println("车库关灯");
    }

}
