package designmode.strategy.calc.student;/**
 * @Author: dyf
 * @Date: 2019/6/9 11:12
 * @Description:
 */

import designmode.strategy.calc.studentbehavior.Go2ClassBehavior;
import designmode.strategy.calc.studentbehavior.SportBehavior;

/**
 * @Author: dyf
 * @Date: 2019/6/9 11:12
 * @Description:
 */
public abstract class Student {
    public abstract void displayGradeName();

    protected Go2ClassBehavior go2ClassBehavior;
    protected SportBehavior sportBehavior;

    public void setGo2ClassBehavior(Go2ClassBehavior go2ClassBehavior) {//可以自己设置上什么课
        this.go2ClassBehavior = go2ClassBehavior;
    }

    public void setSportBehavior(SportBehavior sportBehavior) {//可以自己设置做什么运动
        this.sportBehavior = sportBehavior;
    }

    public void performGo2class(){
        go2ClassBehavior.listenClass();
    }

    public void performSport(){
        sportBehavior.doSport();
    }
}
