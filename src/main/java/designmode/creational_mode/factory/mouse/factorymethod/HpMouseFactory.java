package designmode.creational_mode.factory.mouse.factorymethod;

import designmode.creational_mode.factory.mouse.HpMouse;
import designmode.creational_mode.factory.mouse.Mouse;

/**
 * @Author: dyf
 * @Date: 2019/5/16 21:53
 * @Description:
 */
public class HpMouseFactory implements Factory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
