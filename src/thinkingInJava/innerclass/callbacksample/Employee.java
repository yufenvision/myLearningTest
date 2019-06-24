package thinkingInJava.innerclass.callbacksample;

import java.util.Random;

/**
 * @Author: dyf
 * @Date: 2019/6/24 22:37
 * @Description: 公司员工
 */
public class Employee {
    public void doSomething(CallBack callBack, String task){
        //上级通过dosomething方法让员工做什么
        System.out.println(task);

        callBack.backResult("员工用时" + new Random().nextInt(50) + " 秒，完成了这件事");
    }
}
