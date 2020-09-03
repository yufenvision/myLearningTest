package mutipleThread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: dyf
 * @Date: 2020/8/27 16:16
 * @Description:
 */
public class AtomicIntegerTest {
    private AtomicInteger count = new AtomicInteger();
    //使用AtomicInteger之后，不需要对该方法加锁，也可以实现线程安全。
    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

}
