package designmode.behavioral_mode.command;

/**
 * @Author: dyf
 * @Date: 2019/6/5 14:24
 * @Description:
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void excute() {
        garageDoor.lightOn();
    }
}
