package designmode.behavioral_mode.strategy.calc.studentbehavior;/**
 * @Author: dyf
 * @Date: 2019/6/9 17:21
 * @Description:
 */

/**
 * @Author: dyf
 * @Date: 2019/6/9 17:21
 * @Description:
 */
public class MathClass implements Go2ClassBehavior {
    @Override
    public void listenClass() {
        System.out.println("上数学课");
    }
}
