package mutipleThread.threadlocal.example;

import java.util.concurrent.CountDownLatch;
import java.util.function.Supplier;

/**
 * @Author: dyf
 * @Date: 2020/8/25 12:31
 * @Description:
 */
public class ThreadLocalDemo {

    public static void main(String[] args) throws InterruptedException {

        int threads = 3;
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        InnerClass innerClass = new InnerClass();
        for(int i = 1; i <= threads; i++) {
            new Thread(() -> {
                for(int j = 0; j < 4; j++) {
                    innerClass.add(String.valueOf(j));
                    innerClass.print();
                }
                innerClass.set("hello world");
                countDownLatch.countDown();
            }, "thread - " + i).start();
        }
        countDownLatch.await();
        System.out.println("3个线程都完成计数了。。。");
    }

    private static class InnerClass {

        public void add(String newStr) {
            StringBuilder str = Counter.counter.get();
            Counter.counter.set(str.append(newStr));
        }

        public void print() {
            System.out.printf("Thread name:%s , ThreadLocal hashcode:%s, Instance hashcode:%s, Value:%s\n",
                    Thread.currentThread().getName(),
                    Counter.counter.hashCode(),//获取的threadlocal，它仅作为一个key来使用
                    Counter.counter.get().hashCode(),//获取的是threadlocal对应在threadlocalMap中的value值
                    Counter.counter.get().toString());//获取value中对象，也就是StringBuilder中的值
        }

        public void set(String words) {
            Counter.counter.set(new StringBuilder(words));
            System.out.printf("Set, Thread name:%s , ThreadLocal hashcode:%s,  Instance hashcode:%s, Value:%s\n",
                    Thread.currentThread().getName(),
                    Counter.counter.hashCode(),
                    Counter.counter.get().hashCode(),
                    Counter.counter.get().toString());
        }
    }

    private static class Counter {

//        private static ThreadLocal<StringBuilder> counter = new ThreadLocal<StringBuilder>() {
//            @Override
//            protected StringBuilder initialValue() {
//                return new StringBuilder();
//            }
//        };
        private static ThreadLocal<StringBuilder> counter = ThreadLocal.withInitial(() -> new StringBuilder());

    }
    /*
    http://www.jasongj.com/java/threadlocal/
    ThreadLocalMap 的 Entry 对 ThreadLocal 的引用为弱引用，避免了 ThreadLocal 对象无法被回收的问题
    ThreadLocalMap 的 set 方法通过调用 replaceStaleEntry 方法回收键为 null 的 Entry 对象的值（即为具体实例）以及 Entry 对象本身从而防止内存泄漏
    ThreadLocal 适用于变量在线程间隔离且在方法间共享的场景

     */

}
