package java_base.functional_code.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author: dyf
 * @Date: 2020/12/9 22:50
 * @Description:
 */
public class ParallelStream {
    public static void main(String[] args) {

        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        simpleSort(values);

        parallelSor(values);
        //上面两个代码几乎是一样的，但是并行版的快了 50% 左右，唯一需要做的改动就是将 stream() 改为parallelStream()。
    }

    static void simpleSort(List<String> values){
        //串行排序
        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("串行排序耗时: %d ms", millis));
    }

    static void parallelSor(List<String> values){
        //并行排序
        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("并行排序耗时: %d ms", millis));
    }

}
