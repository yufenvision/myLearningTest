package thinkingInJava.innerclass.callbacksample;

/**
 * @Author: dyf
 * @Date: 2019/6/30 11:05
 * @Description: 匿名上级，用匿名内部类实现回调
 */
public class AnonymousSenior {

    private String result;

    public AnonymousSenior(Employee employee, CallBack callBack) {
        employee.doSomething(callBack, "《匿名上级》让你做事！");
    }

    //匿名上级要的结果
    public String getResult() {
        return result;
    }

}
