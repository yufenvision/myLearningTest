package java_mutiple_thread.synchronized_scope_test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: dyf
 * @Date: 2020/11/17 22:27
 * @Description:
 */
public class CodeBlockAndMethod {

    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        ExecutorService pool = Executors.newCachedThreadPool();

        //对于以下代码，使用 ExecutorService 执行了两个线程，由于调用的是同一个对象的同步代码块，因此这两个线程会进行同步，当一个线程进入同步语句块时，另一个线程就必须等待。
//        pool.execute(() -> count.count());
//        pool.execute(() -> count.count());
//
//        pool.execute(() -> count.count1());
//        pool.execute(() -> count.count1());
//        pool.shutdown();

        //对于以下代码，两个线程调用了不同对象的同步代码块，因此这两个线程就不需要同步。从输出结果可以看出，两个线程交叉执行。
        Count count1 = new Count();
        Count count2 = new Count();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        pool.execute(() -> count1.count1(countDownLatch));
        pool.execute(() -> count2.count1(countDownLatch));
        countDownLatch.await();
        System.out.println("\n==============================");
        pool.shutdown();
    }


}
