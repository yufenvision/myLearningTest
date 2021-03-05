package java_mutiple_thread.thread_communication.printabc;

import java.util.HashSet;
import java.util.Set;
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

        WaitNotifyPrinter a = new WaitNotifyPrinter(0);
        WaitNotifyPrinter b = new WaitNotifyPrinter(1);
        WaitNotifyPrinter c = new WaitNotifyPrinter(2);
        System.out.println(a.lock == b.lock && b.lock == c.lock);
        System.out.println(a.state == b.state && b.state == c.state);

        a.start();
        b.start();
        c.start();


    }

}

