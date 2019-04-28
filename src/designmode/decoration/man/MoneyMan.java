package designmode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 17:05
 * @Description:
 */
public class MoneyMan extends SuperMan {
    public MoneyMan(IMan iMan) {
        super(iMan);
    }

    @Override
    public String say() {
        return iMan.say() + "我还很会赚钱";
    }
}
