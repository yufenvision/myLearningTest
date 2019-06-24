package thinkingInJava.innerclass.callbacksample;

/**
 * @Author: dyf
 * @Date: 2019/6/24 22:47
 * @Description:
 */
public class MainTest {
    public static void main(String[] args){
        Employee employee = new Employee();
        Manager manager = new Manager(employee);//公司经理叫员工做事
        System.out.println(manager.getResult());
        HR hr = new HR(employee);//人事也叫员工填表格
        System.out.println(hr.getHrResult());
    }
}
