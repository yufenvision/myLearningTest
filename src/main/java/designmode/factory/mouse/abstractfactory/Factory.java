package designmode.factory.mouse.abstractfactory;


import designmode.factory.mouse.Mouse;

/**
 * @Author: dyf
 * @Date: 2019/5/17 14:42
 * @Description:
 */
public interface Factory {

    Mouse createMouse();

    KeyBoard createKeyBoard();
}
