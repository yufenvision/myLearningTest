package designmode.creational_mode.factory.mouse.abstractfactory;

/**
 * @Author: dyf
 * @Date: 2019/5/17 16:32
 * @Description:
 */
public class CreateTest {
    public static void main(String[] args){
        Factory f = new DellFactory();
        f.createKeyBoard().logo();
        f.createMouse().logo();
        f = new HpFactory();
        f.createMouse().logo();
        f.createKeyBoard().logo();


    }
}
