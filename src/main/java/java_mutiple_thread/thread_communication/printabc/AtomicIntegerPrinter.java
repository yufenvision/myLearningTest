package java_mutiple_thread.thread_communication.printabc;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: dyf
 * @Date: 2021/3/1 19:35
 * @Description:
 */
public class AtomicIntegerPrinter implements Runnable{
    private AtomicInteger num;

    public AtomicIntegerPrinter(AtomicInteger num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (num){
                if(num.get() % 3 == 0){
                    System.out.println("A");
                    num.getAndIncrement();
                }else if(num.get() % 3 == 1){
                    System.out.println("B");
                    num.getAndIncrement();
                }else if(num.get() % 3 ==2){
                    System.out.println("C");
                    num.getAndIncrement();
                }

            }
        }

    }
}
