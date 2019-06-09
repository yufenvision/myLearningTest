package designmode.strategy.calc.student;/**
 * @Author: dyf
 * @Date: 2019/6/9 11:33
 * @Description:
 */

import designmode.strategy.calc.studentbehavior.ChineseClass;
import designmode.strategy.calc.studentbehavior.Go2ClassBehavior;
import designmode.strategy.calc.studentbehavior.Running;
import designmode.strategy.calc.studentbehavior.SportBehavior;

/**
 * @Author: dyf
 * @Date: 2019/6/9 11:33
 * @Description:
 */
public class FirstGrade extends Student{

    public FirstGrade() {
        go2ClassBehavior = new ChineseClass();
        sportBehavior = new Running();
    }

    @Override
    public void displayGradeName() {
        System.out.println("我是一年级的学生");
    }
}
