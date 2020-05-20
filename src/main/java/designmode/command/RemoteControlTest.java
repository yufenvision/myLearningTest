package designmode.command;

/**
 * @Author: dyf
 * @Date: 2019/6/5 14:08
 * @Description:
 */
public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightCommand lightCommand = new LightCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();

    }

}
