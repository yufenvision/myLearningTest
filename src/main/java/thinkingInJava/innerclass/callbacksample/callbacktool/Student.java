package thinkingInJava.innerclass.callbacksample.callbacktool;

/**
 * @Author: dyf
 * @Date: 2019/7/1 00:17
 * @Description:
 */
public class Student implements CallBack {
    private Integer sum;
    @Override
    public void excute() {
        int i = 0;
        while(i < 500){
            System.out.print(i + ",");
            i++;
        }
        System.out.println();
    }
}
