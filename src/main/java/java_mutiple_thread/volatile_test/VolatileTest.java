package java_mutiple_thread.volatile_test;

/**
 * @Author: dyf
 * @Date: 2021/7/8 16:47
 * @Description:
 */
public class VolatileTest {

    public static volatile int race = 0;
    public static void increase(){
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        //等待所有累加线程都结束
        while (Thread.activeCount() > 2){//idea的main方法默认启动两个线程
            Thread.yield();
        }

        System.out.println(race);
    }
}
