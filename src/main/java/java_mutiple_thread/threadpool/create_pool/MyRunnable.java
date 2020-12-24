package java_mutiple_thread.threadpool.create_pool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: dyf
 * @Date: 2020/11/20 22:43
 * @Description:
 */
public class MyRunnable implements Runnable{
    private String command;
    public MyRunnable(String s) {
        this.command = s;
    }
    String datePattern = "yyyy-MM-dd HH:mm:ss";

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 开始时间 = " + DateTimeFormatter.ofPattern(datePattern).format(LocalDateTime.now()));
        processCommand();
        System.out.println(Thread.currentThread().getName() + " 结束时间 = " + DateTimeFormatter.ofPattern(datePattern).format(LocalDateTime.now()));
    }
    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return this.command;
    }
}
