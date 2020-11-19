package java_mutiple_thread.threadlocal.countdownlatch;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: dyf
 * @Date: 2020/8/25 17:20
 * @Description:
 */
public class Customer implements Runnable {

    private CountDownLatch latch;
    private String name;

    public Customer(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
            Random random = new Random();
            System.out.println(sdf.format(new Date()) + " " + name + "出发去饭店");
            Thread.sleep((long) (random.nextDouble() * 3000) + 1000);
            System.out.println(sdf.format(new Date()) + " " + name + "到了饭店");
            latch.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
