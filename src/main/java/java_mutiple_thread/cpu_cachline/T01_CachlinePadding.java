package java_mutiple_thread.cpu_cachline;

/**
 * @Author: dyf
 * @Date: 2020/12/6 11:17
 * @Description:
 */
public class T01_CachlinePadding {

    private static class T{
        public volatile long x = 0L;
    }

    public static T[] arr = new T[2];
    static {
        arr[0] = new T();
        arr[1] = new T();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000_0000L; i++) {
                arr[0].x = i;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 1000_0000L; j++) {
                arr[1].x = j;
            }
        });

        final long start = System.nanoTime();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println((System.nanoTime() - start)/100_0000);

    }

}
