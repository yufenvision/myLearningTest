package designmode.factory.mouse.factorymethod;

import designmode.factory.mouse.HpMouse;
import designmode.factory.mouse.Mouse;

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
