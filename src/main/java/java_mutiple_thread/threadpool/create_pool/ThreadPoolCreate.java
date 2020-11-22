package java_mutiple_thread.threadpool.create_pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: dyf
 * @Date: 2020/11/20 22:36
 * @Description:
 */
public class ThreadPoolCreate {

    private static final int CORE_POOL_SIZE = 5;//核⼼线程数为 5。
    private static final int MAX_POOL_SIZE = 10;//最⼤线程数 10
    private static final int QUEUE_CAPACITY = 100;
    private static final long KEEP_ALIVE_TIME = 1L;//等待时间为 1L

    public static void main(String[] args) {

        //使⽤阿⾥巴巴推荐的创建线程池的⽅式
        //通过ThreadPoolExecutor构造函数⾃定义参数创建
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            CORE_POOL_SIZE,
            MAX_POOL_SIZE,
            KEEP_ALIVE_TIME,
            TimeUnit.SECONDS,//等待时间的单位为 TimeUnit.SECONDS
            new ArrayBlockingQueue<>(QUEUE_CAPACITY),//任务队列为 ArrayBlockingQueue,并且容量为 100;
            new ThreadPoolExecutor.CallerRunsPolicy()//饱和策略为 CallerRunsPolicy
        );

        for (int i = 0; i < 10; i++) {
            //创建WorkerThread对象（WorkerThread类实现了Runnable 接⼝）
            Runnable worker = new MyRunnable("" + i);
            //执⾏Runnable
            threadPoolExecutor.execute(worker);
        }
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()) {
        }
        System.out.println("Finished all threads");

    }
}
