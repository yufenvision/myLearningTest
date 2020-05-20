package designmode.factory.mouse.factorymethod;

import designmode.factory.mouse.DellMouse;
import designmode.factory.mouse.Mouse;

/**
 * @Author: dyf
 * @Date: 2019/5/16 21:50
 * @Description:
 */
public class DellMouseFactory implements Factory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
