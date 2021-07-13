package java_mutiple_thread.thread_communication.printabc;

/**
 * @Author: dyf
 * @Date: 2021/3/1 20:06
 * @Description:
 */
public class WaitNotifyPrinter extends Thread {
    Integer num;
    static volatile int state;
    static final Object lock = new Object();

    public WaitNotifyPrinter(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (lock){//这里的lock直接用WaitNotifyPrinter.class对象也可以
                while (state % 3 != num){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(toABC(num)); // 执行到这里，表明满足条件，打印
                state++;
                lock.notifyAll();
            }

        }
    }

    private static char toABC(int which) {
        return (char) ('A' + which);
    }

}
