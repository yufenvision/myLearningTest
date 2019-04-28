package designmode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 16:42
 * @Description: 居家的男人
 */
public class HouseMan extends SuperMan{
    public HouseMan(IMan iMan) {
        super(iMan);
    }

    @Override
    public String say() {
        return iMan.say() + "我还会做家务";
    }
}
