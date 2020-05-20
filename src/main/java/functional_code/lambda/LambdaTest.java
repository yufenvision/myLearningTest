package functional_code.lambda;

import java.math.BigDecimal;
import java.util.function.*;

/**
 * @Author: dyf
 * @Date: 2019/7/22 21:09
 * @Description:
 */
public class LambdaTest {
    public static void main(String[] args){
        Predicate<Integer> predicate = h -> h > 185;
        Student s = new Student("小明", 15, 190);
        System.out.println(s.getName() + "的身高大于185cm吗？ " + predicate.test(s.getHeight()));

        Consumer<String> consumer = System.out::println;
        consumer.accept("这里是消费者函数，输入Stirng，没有输出");

        Function<Student, String> function = Student::getName;
        String name = function.apply(s);
        System.out.println(name);

        Supplier<Integer> supplier = () -> Integer.valueOf(BigDecimal.TEN.toString());
        System.out.println(supplier.get());

        //单元运算
        UnaryOperator<Boolean> unaryOperator = uglily -> !uglily;
        Boolean apply2 = unaryOperator.apply(true);
        System.out.println(apply2);

        BinaryOperator<Integer> operator = (x, y) -> x * y;
        Integer integer = operator.apply(2, 3);
        System.out.println(integer);

        test(() -> "自定义函数");
    }


    /**
     * 自定义函数
     * @return: void
     * @param: [worker]
     * @Author: dyf
     * @Date: 2019/7/22 21:31
    */
    public static void test(Worker worker) {
        String work = worker.work();
        System.out.println(work);
    }

    private interface Worker{
        String work();
    }
}
