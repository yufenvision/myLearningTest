package java_mutiple_thread.threadlocal.countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: dyf
 * @Date: 2020/8/25 17:26
 * @Description:
 */
public class GoDinerTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        List<Thread> threads = new ArrayList<>(3);
        threads.add(new Thread(new Customer(latch, "张三")));
        threads.add(new Thread(new Customer(latch, "李四")));
        threads.add(new Thread(new Customer(latch, "王五")));
        for (Thread thread : threads) {
            thread.start();
        }

        Thread.sleep(100);
        new Thread(new Waitress(latch, "♥小芳♥")).start();

        for (Thread thread : threads) {
            thread.join();
        }
        //https://www.zhihu.com/search?type=content&q=CountDownLatch%20
    }

}
