package thinkingInJava.innerclass.closure_callback;

/**
 * @Author: dyf
 * @Date: 2019/6/22 15:41
 * @Description: 简单的实现接口
 */
public class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
