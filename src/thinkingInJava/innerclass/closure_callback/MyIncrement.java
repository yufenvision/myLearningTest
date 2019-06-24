package thinkingInJava.innerclass.closure_callback;

/**
 * @Author: dyf
 * @Date: 2019/6/22 15:43
 * @Description:
 */
public class MyIncrement {
    public void increment(){
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi){
        mi.increment();
    }
}
