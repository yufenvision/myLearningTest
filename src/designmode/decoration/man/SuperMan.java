package designmode.decoration.man;

/**
 * @Author: dyf
 * @Date: 2019/4/26 16:35
 * @Description: 装饰器男人（增男人）
 */
public class SuperMan implements IMan {
    protected IMan iMan;

    public SuperMan(IMan iMan) {
        this.iMan = iMan;
    }

    public SuperMan() {
    }

    @Override
    public String say() {
        return "★★增强过的:" + iMan.say();
    }
}
