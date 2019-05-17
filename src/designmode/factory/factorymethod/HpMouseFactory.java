package designmode.factory.factorymethod;

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
