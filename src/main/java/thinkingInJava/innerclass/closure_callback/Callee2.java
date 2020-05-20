package thinkingInJava.innerclass.closure_callback;

/**
 * @Author: dyf
 * @Date: 2019/6/22 15:44
 * @Description:
 */
public class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }
    //假如你的类必须继承实现接口的increment()方法，你必须使用内部类，因为MyIncrement已经有了一个increment()方法
    private class Closure implements Incrementable{
        //特别的外部类方法，除非你没有获得无限的迭代
        @Override
        public void increment() {
            Callee2.this.increment();//实际上调用父类的increment方法
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }

}
