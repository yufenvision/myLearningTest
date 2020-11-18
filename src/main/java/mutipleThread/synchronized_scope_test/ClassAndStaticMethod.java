package mutipleThread.synchronized_scope_test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: dyf
 * @Date: 2020/11/17 22:27
 * @Description:
 */
public class ClassAndStaticMethod {

    public static void main(String[] args) {
        Count count1 = new Count();
        Count count2 = new Count();
        ExecutorService pool = Executors.newCachedThreadPool();

        //作用于整个类，也就是说两个线程调用同一个类的不同对象上的这种同步语句，也会进行同步。
        pool.execute(() -> count1.count2());
        pool.execute(() -> count2.count2());
        pool.shutdown();

        //静态方法同理，作用于整个类
//        pool.execute(() -> count1.count3());
//        pool.execute(() -> count2.count3());
//        pool.shutdown();

    }
}
