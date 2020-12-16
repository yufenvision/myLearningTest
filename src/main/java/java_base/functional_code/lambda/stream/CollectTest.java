package java_base.functional_code.lambda.stream;

import java_base.functional_code.lambda.Student;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: dyf
 * @Date: 2020/12/7 21:25
 * @Description:
 */
public class CollectTest {

    static List<Student> students = Stream.of(
            new Student("樱木花道", 16, 188),
            new Student("樱木花道", 16, 180),
            new Student("流川枫", 16, 187),
            new Student("三井寿", 17, 175),
            new Student("宫城良田", 16, 167),
            new Student("赤木刚宪", 18, 192)).collect(Collectors.toList());

    public static void main(String[] args) {

        //根据属性去重
        List<Student> distinctStudent = students.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o -> o.getName() + ";" + o.getAge()))), ArrayList::new));

        List<Student> distinctStudent2 = students.stream().distinct().collect(Collectors.toList());
        System.out.println(students);
        System.out.println(distinctStudent);
        System.out.println(distinctStudent2);

        //自己写
        Map<String, Student> map = new HashMap<>();
        students.forEach(v -> map.put(v.getName() + ";" + v.getAge(), v));
        List<Student> myList = map.values().stream().collect(Collectors.toList());
        System.out.println(myList);

    }

    @Test
    public void splitList(){
        //方法一：使用流遍历操作
        List<List<Student>> mglist = splitList(students, 10);
        mglist.forEach(v -> System.out.println(v));
    }

    /**
     * Description: Java8 Stream分割list集合
     * @param list 集合数据
     * @param splitSize 几个分割一组
     * @return 集合分割后的集合
     */
    public static <T> List<List<T>> splitList(List<T> list, int splitSize) {
        //判断集合是否为空
        if (list.size() == 0)
            return Collections.emptyList();
        //计算分割后的大小
        int maxSize = (list.size() + splitSize - 1) / splitSize;
        //开始分割
        return Stream.iterate(0, n -> n + 1)
                .limit(maxSize)
                .parallel()
                .map(a -> list.parallelStream().skip(a * splitSize).limit(splitSize).collect(Collectors.toList()))
                .filter(b -> !b.isEmpty())
                .collect(Collectors.toList());
    }

    @Test
    public void testListDispatch(){
        int limit = students.size();
        List<List<Student>> splitList = Stream.iterate(0, n -> n + 1).limit(limit).parallel().map(a -> students.stream().skip(a * 2).limit(2).parallel().collect(Collectors.toList())).collect(Collectors.toList());
        splitList.forEach(v -> System.out.println(v));
    }

    @Test
    public void getProcessors(){
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
