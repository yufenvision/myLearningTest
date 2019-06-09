package designmode.strategy.calc;/**
 * @Author: dyf
 * @Date: 2019/6/9 17:28
 * @Description:
 */

import designmode.strategy.calc.student.FirstGrade;
import designmode.strategy.calc.student.SecondGrade;
import designmode.strategy.calc.student.Student;
import designmode.strategy.calc.student.ThirdGrade;
import designmode.strategy.calc.studentbehavior.EnglishClass;
import designmode.strategy.calc.studentbehavior.MathClass;

/**
 * @Author: dyf
 * @Date: 2019/6/9 17:28
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args){
        Student s = new FirstGrade();
        s.displayGradeName();
        s.performGo2class();
        s.performSport();

        System.out.println("----------------------------");

        s = new SecondGrade();
        s.displayGradeName();
        s.performGo2class();
        s.setGo2ClassBehavior(new MathClass());
        s.performGo2class();
        s.performSport();

        System.out.println("----------------------------");

        s = new ThirdGrade();
        s.displayGradeName();
        s.performGo2class();
        s.setGo2ClassBehavior(new MathClass());
        s.performGo2class();
        s.setGo2ClassBehavior(new EnglishClass());
        s.performGo2class();
        s.performSport();
    }
}
