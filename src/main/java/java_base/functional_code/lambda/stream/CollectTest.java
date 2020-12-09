package java_base.functional_code.lambda.stream;

import java_base.functional_code.lambda.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: dyf
 * @Date: 2020/12/7 21:25
 * @Description:
 */
public class CollectTest {

    public static void main(String[] args) {
        List<Student> students = Stream.of(
                new Student("樱木花道", 16, 188),
                new Student("樱木花道", 16, 180),
                new Student("流川枫", 16, 187),
                new Student("三井寿", 17, 175),
                new Student("宫城良田", 16, 167),
                new Student("赤木刚宪", 18, 192)).collect(Collectors.toList());

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


}
