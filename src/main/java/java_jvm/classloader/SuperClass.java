package java_jvm.classloader;

/**
 * @Author: dyf
 * @Date: 2021/7/8 09:05
 * @Description:
 */
public class SuperClass {

    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}
