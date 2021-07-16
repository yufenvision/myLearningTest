package designmode.creational_mode.singleton.chocolate;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: dyf
 * @Date: 2019/6/3 21:42
 * @Description: 用双重检查加锁，在getInstance()中减少使用同步
 * 首先检查是否实例已经创建了，如果尚未创建，才进行同步，这样一来，只有第一次会同步，这正是我们想要的
 */
public class Singleton {
    /**
     * volatile关键词确保，不发生指令重排：
     * 主要是防止，invokeSepcial给初始化后的变量赋值，astore给变量指向对象引用，这两步的指令重排
     * 因为字节码在new以后，给uniqueInstance的初始化赋值是null，这时候处于半初始化状态
     * 而真正给uniqueInstance变量赋值成，Singleton对象的引用的操作是invokeSepcial
     */
    private volatile static Singleton uniqueInstance;

    private Singleton() {}
    public static Singleton getInstance(){
        if(uniqueInstance == null){//检查实例，如果不存在，就进入同步区块，注意：只有第一次才彻底执行这里的代码
            synchronized(Singleton.class){//DCL,double check lock
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    //如果性能是你关心的重点，那么这个做法可以帮你大大地减少getInstance()的时间耗费。
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5, 10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(100));
        for (int i = 0; i < 100 ; i++) {
            threadPoolExecutor.execute(() -> System.out.println(Singleton.getInstance().hashCode()));
        }
        threadPoolExecutor.shutdown();
    }
}
