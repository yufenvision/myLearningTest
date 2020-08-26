package mutipleThread.threadlocal.example;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: dyf
 * @Date: 2020/8/24 16:27
 * @Description:
 */
public class MyStringDemo {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


    public static void main(String[] args) throws InterruptedException {
        int threads = 9;
        MyStringDemo demo = new MyStringDemo();
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        for (int i = 0; i < threads; i++) {
            Thread thread = new Thread(() -> {
                demo.setString(Thread.currentThread().getName());
                System.out.println(demo.getString());
                countDownLatch.countDown();
            }, "thread - " + i);
            thread.start();
        }
        System.out.println("线程执行开始......");
        countDownLatch.await();
        System.out.println("线程执行完成......");
    }

}
