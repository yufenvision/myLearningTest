package mutipleThread.threadlocal.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Author: dyf
 * @Date: 2020/8/25 17:07
 * @Description:
 */
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        Service service = new Service(latch);
        Runnable task = () -> service.exec();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }

        System.out.println("main thread await. ");
        latch.await();
        System.out.println("main thread finishes await. ");
    }

    static class Service {
        private CountDownLatch latch;

        public Service(CountDownLatch latch) {
            this.latch = latch;
        }

        public void exec() {
            try {
                System.out.println(Thread.currentThread().getName() + " execute task. ");
                sleep(2);
                System.out.println(Thread.currentThread().getName() + " finished task. ");
            } finally {
                latch.countDown();
            }
        }

        private void sleep(int seconds) {
            try {
                TimeUnit.SECONDS.sleep(seconds);//其实是Thread.sleep的包装类，seconds可以直接写秒，不用写毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


