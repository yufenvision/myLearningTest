package thinkingInJava.innerclass.closure_callback;

/**
 * @Author: dyf
 * @Date: 2019/6/22 15:52
 * @Description:
 */
public class Callbacks {
    public static void main(String[] args){
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
