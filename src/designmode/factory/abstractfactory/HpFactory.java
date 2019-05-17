package designmode.factory.abstractfactory;

/**
 * @Author: dyf
 * @Date: 2019/5/17 16:32
 * @Description:
 */
public class HpFactory implements Factory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
