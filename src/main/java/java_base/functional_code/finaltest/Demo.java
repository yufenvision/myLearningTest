package java_base.functional_code.finaltest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Author: dyf
 * @Date: 2021/3/8 22:27
 * @Description: lambda使用外部变量必须为final为什么？
 */
public class Demo {

    private static Integer num = 0;

    private static List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3});
    private static Map<String, Object> cacheMap = new HashMap<>(2);
    static Consumer consumer = (v) -> {
        System.out.println(v);
        num = 2;
        System.out.println(num);
    };

    static void doSome(){
        list.forEach(v -> num = num + v);
    }

    public static void main(String[] args) {
        consumer.accept(num);
        System.out.println(cacheMap.put("key", "value"));
        System.out.println(cacheMap.put("key", "value1"));
    }

}
