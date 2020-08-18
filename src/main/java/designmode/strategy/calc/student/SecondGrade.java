package designmode.strategy.calc.student;/**
 * @Author: dyf
 * @Date: 2019/6/9 11:33
 * @Description:
 */

import designmode.strategy.calc.studentbehavior.ChineseClass;
import designmode.strategy.calc.studentbehavior.Running;

/**
 * @Author: dyf
 * @Date: 2019/6/9 11:33
 * @Description:
 */
public class SecondGrade extends Student{
    public SecondGrade() {
        go2ClassBehavior = new ChineseClass();
        sportBehavior = new Running();
    }

    @Override
    public void displayGradeName() {
        System.out.println("我是二年级学生");
    }
}