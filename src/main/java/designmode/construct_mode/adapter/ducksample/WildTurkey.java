package designmode.construct_mode.adapter.ducksample;

/**
 * @Author: dyf
 * @Date: 2019/6/3 22:29
 * @Description:
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("火鸡咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("只能飞很短的距离");
    }
}
