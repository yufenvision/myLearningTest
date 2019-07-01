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

        final String[] xx = new String[1];
        xx[0] = "";
        //匿名内部类
        AnonymousSenior anonymousSenior = new AnonymousSenior(employee, new CallBack() {
            @Override
            public void backResult(String result) {//这里也可以抽象类来代替CallBack接口，直接用this来操作抽象类里面的属性与方法
                xx[0] = result;
            }
        });
        anonymousSenior.setResult(xx[0]);
        System.out.println(anonymousSenior.getResult());
    }
}
