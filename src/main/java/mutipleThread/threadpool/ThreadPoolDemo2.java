package mutipleThread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: dyf
 * @Date: 2020/11/17 21:50
 * @Description:
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newCachedThreadPool();//一个任务创建一个线程
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.shutdown();
    }
}
