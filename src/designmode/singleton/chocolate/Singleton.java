package designmode.singleton.chocolate;

/**
 * @Author: dyf
 * @Date: 2019/6/3 21:42
 * @Description: 用双重检查加锁，在getInstance()中减少使用同步
 * 首先检查是否实例已经创建了，如果尚未创建，才进行同步，这样一来，只有第一次会同步，这正是我们想要的
 */
public class Singleton {
    /**
     * volatile关键词确保：当uniqueInstance变量被初始化成Singleton实例，多个线程正确地处理uniqueInstance变量;
     */
    private volatile static Singleton uniqueInstance;

    private Singleton() {}
    public static Singleton getInstance(){
        if(uniqueInstance == null){//检查实例，如果不存在，就进入同步区块，注意：只有第一次才彻底执行这里的代码
            synchronized(Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    //如果性能是你关心的重点，那么这个做法可以帮你大大地减少getInstance()的时间耗费。
}
