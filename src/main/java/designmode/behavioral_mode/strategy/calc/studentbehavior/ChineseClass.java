package designmode.behavioral_mode.strategy.calc.studentbehavior;/**
 * @Author: dyf
 * @Date: 2019/6/9 17:20
 * @Description:
 */

/**
 * @Author: dyf
 * @Date: 2019/6/9 17:20
 * @Description:
 */
public class ChineseClass implements  Go2ClassBehavior {
    @Override
    public void listenClass() {
        System.out.println("上语文课");
    }
}
