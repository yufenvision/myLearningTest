package java_mutiple_thread.thread_communication;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: dyf
 * @Date: 2021/1/18 23:11
 * @Description:
 */
public class BlockQueue {

    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        //读线程
        new Thread(() -> {
            int i =0;
            while (true) {
                try {
                    String item = queue.take();
                    System.out.print(Thread.currentThread().getName() + ": " + i + " ");
                    System.out.println(item);
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"读取线程").start();
        //写线程
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    String item = "go"+i;
                    System.out.print(Thread.currentThread().getName() + ": " + i + " ");
                    System.out.println(item);
                    queue.put(item);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"写入线程").start();
    }
}
