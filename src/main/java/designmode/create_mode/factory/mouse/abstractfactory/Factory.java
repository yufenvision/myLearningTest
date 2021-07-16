package designmode.create_mode.factory.mouse.abstractfactory;


import designmode.create_mode.factory.mouse.Mouse;

/**
 * @Author: dyf
 * @Date: 2019/5/17 14:42
 * @Description:
 */
public interface Factory {

    Mouse createMouse();

    KeyBoard createKeyBoard();
}
