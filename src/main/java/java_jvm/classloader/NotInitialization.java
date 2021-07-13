package java_jvm.classloader;

/**
 * @Author: dyf
 * @Date: 2021/7/8 09:07
 * @Description:
 */
public class NotInitialization {
    public static void main(String[] args) {

        /**
         * 非主动使用类字段演示：通过子类引用父类的静态字段，不会导致子类的初始化
         */
        System.out.println(SubClass.value);
        System.out.println("**************************");
        /**
         * 通过数组定义来引用类，不会触发此类的初始化
         */
        SuperClass[] sca = new SuperClass[10];
    }
}
