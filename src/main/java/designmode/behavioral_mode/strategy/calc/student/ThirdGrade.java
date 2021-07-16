package designmode.behavioral_mode.strategy.calc.student;/**
 * @Author: dyf
 * @Date: 2019/6/9 11:34
 * @Description:
 */

import designmode.behavioral_mode.strategy.calc.studentbehavior.Basketball;
import designmode.behavioral_mode.strategy.calc.studentbehavior.ChineseClass;

/**
 * @Author: dyf
 * @Date: 2019/6/9 11:34
 * @Description:
 */
public class ThirdGrade extends Student{
    public ThirdGrade() {
        go2ClassBehavior = new ChineseClass();
        sportBehavior = new Basketball();
    }

    @Override
    public void displayGradeName() {
        System.out.println("我是三年级学生");
    }
}
