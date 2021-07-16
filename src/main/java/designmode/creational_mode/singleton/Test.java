package designmode.creational_mode.singleton;

/**
 * @Author: dyf
 * @Date: 2019/6/24 21:50
 * @Description:
 */
public class Test {
    public static void main(String[] args){
        System.out.println(SingletonEnum.INSTANCE1);
        System.out.println(SingletonEnum.INSTANCE2.getName());



    }


    static class ThreadDemo implements Runnable{

        @Override
        public void run() {


        }
    }

}
