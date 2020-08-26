package mutipleThread.threadlocal.example;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: dyf
 * @Date: 2020/8/25 10:55
 * @Description:
 */
public class MyThreadLocalStringDemo {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static String getString() {
        return threadLocal.get();
    }

    public static void setString(String string) {
        threadLocal.set(string);
    }

    public static void main(String[] args){
        int threads = 9;
        MyThreadLocalStringDemo demo = new MyThreadLocalStringDemo();
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        for (int i = 0; i < threads; i++) {
            Thread thread = new Thread(() -> {
                demo.setString(Thread.currentThread().getName());
                System.out.println(demo.getString());
                countDownLatch.countDown();
            }, "thread - " + i);
            thread.start();
        }
    }

}
