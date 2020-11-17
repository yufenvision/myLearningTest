package mutipleThread.synchronized_scope_test;

/**
 * @Author: dyf
 * @Date: 2020/11/17 22:29
 * @Description:
 */
public class Count {


    public void count(){
        synchronized (this){
            int num = 0;
            while (num < 100){
                System.out.print(num + " ");
                num++;
            }
        }
    }

    public synchronized void count1() {
        int num = 0;
        while (num < 100){
            System.out.print(num + " ");
            num++;
        }
    }


    public static void count2(){
        synchronized (Count.class){
            int num = 0;
            while (num < 100){
                System.out.print(num + " ");
                num++;
            }
        }
    }

    public static void count3(){
        int num = 0;
        while (num < 100){
            System.out.print(num + " ");
            num++;
        }
    }

}
