package mutipleThread.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: dyf
 * @Date: 2019/11/19 17:04
 * @Description:
 * 学习了最基本的操作之后，我们用一段代码来演示ThreadLocal的用法，该例子实现下面这个场景：
 * 有5个线程，这5个线程都有一个值value，初始值为0，线程运行时用一个循环往value值相加数字。
 */
public class TestThreadLocal {

    private static final ThreadLocal<Integer> value = ThreadLocal.withInitial(() -> 0);


    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            new Thread(new MyThread(i)).start();
        }
        //从结果可以看到，各个线程的value值是相互独立的，本线程的累加操作不会影响到其他线程的值，真正达到了线程内部隔离的效果。
    }

    static class MyThread implements Runnable {
        private int index;

        public MyThread(int index) {
            this.index = index;
        }

        public void run() {
            System.out.println("线程" + index + "的初始value:" + value.get());
            for (int i = 0; i < 10; i++) {
                value.set(value.get() + i);
            }
            System.out.println("线程" + index + "的累加value:" + value.get());
        }
    }
}
