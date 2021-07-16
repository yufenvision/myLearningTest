package designmode.behavior_mode.command;

/**
 * @Author: dyf
 * @Date: 2019/6/5 14:04
 * @Description:
 */
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.excute();
    }
}
