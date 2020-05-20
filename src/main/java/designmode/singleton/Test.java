package designmode.singleton;

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
}
