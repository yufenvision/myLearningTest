package designmode.factory.abstractfactory;

/**
 * @Author: dyf
 * @Date: 2019/5/17 16:31
 * @Description:
 */
public class DellFactory implements Factory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
