package thinkingInJava.innerclass.closure_callback;

/**
 * @Author: dyf
 * @Date: 2019/6/22 15:51
 * @Description:
 */
public class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh){
        callbackReference = cbh;
    }
    void go(){
        callbackReference.increment();
    }
}
