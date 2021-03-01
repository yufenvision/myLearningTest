package java_mutiple_thread.thread_communication.printabc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: dyf
 * @Date: 2021/3/1 19:24
 * @Description:
 */
public class PrintABC {


    public static void main(String[] args) {
//        AtomicIntegerPrinter p = new AtomicIntegerPrinter(new AtomicInteger(0));
//        Thread a = new Thread(p);
//        Thread b = new Thread(p);
//        Thread c = new Thread(p);

        Thread a = new WaitNotifyPrinter(0);
        Thread b = new WaitNotifyPrinter(1);
        Thread c = new WaitNotifyPrinter(2);

        a.start();
        b.start();
        c.start();


    }

}

