package thinkingInJava.innerclass.callbacksample;

/**
 * @Author: dyf
 * @Date: 2019/6/24 22:55
 * @Description:
 */
public class HR implements CallBack {
    private String hrResult;

    public HR(Employee employee) {
        employee.doSomething(this, "《人事HR》叫你填表格");
    }

    @Override
    public void backResult(String result) {
        this.hrResult = result;
    }

    public String getHrResult() {
        return hrResult;
    }
}
