package thinkingInJava.innerclass.callbacksample;

/**
 * @Author: dyf
 * @Date: 2019/6/24 22:35
 * @Description: 公司经理
 */
public class Manager implements CallBack{
    private String result;

    /*
     * 回调的两个基本条件：
     * 1.Class A调用Class B中的X方法
     * 2.ClassB中X方法执行的过程中调用Class A中的Y方法完成回调
    */
    
    public Manager(Employee employee) {
        employee.doSomething(this, "《公司经理》让你做事");
    }

    @Override
    public void backResult(String result) {
        this.result = result;
    }

    //公司经理要的结果
    public String getResult() {
        return result;
    }

}
