package thinkingInJava.innerclass.callbacksample;

import java.util.Random;

/**
 * @Author: dyf
 * @Date: 2019/6/24 22:37
 * @Description: 公司员工
 */
public class Employee {
    public void doSomething(CallBack callBack, String task){
        //上级通过dosomething方法让员工做什么task
        System.out.println(task);
        //员工做这件事耗时...
        int time = new Random().nextInt(50);
        callBack.backResult("员工用时" + time + " 秒，完成了这件事");
    }
}
