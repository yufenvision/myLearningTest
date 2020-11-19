package java_base.functional_code.lambdaGetMethodDemo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Author: dyf
 * @Date: 2020/9/16 23:02
 * @Description:
 */
public class lambdaGetDemo {
    public static void main(String[] args) {
        // 静态方法引用--通过类名调用
        Consumer<String> consumerStatic = Java3y::MyNameStatic;
        consumerStatic.accept("3y---static ");

        //实例方法引用--通过实例调用
        Java3y java3y = new Java3y();
        Consumer<String> consumer = java3y::myName;
        consumer.accept("3y---instance");

        // 构造方法方法引用--无参数
        Supplier<Java3y> supplier = Java3y::new;
        System.out.println(supplier.get());

        BiFunction<String, String ,String> someOneSay = java3y::xxSay;
        System.out.println(someOneSay.apply("老段", "我掌握了lambda的引用最简写法"));
    }

}
