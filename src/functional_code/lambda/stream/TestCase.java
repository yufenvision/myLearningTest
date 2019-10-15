package functional_code.lambda.stream;

import functional_code.lambda.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: dyf
 * @Date: 2019/7/22 21:35
 * @Description: 常用的流
 */
public class TestCase {
    /*
        惰性求值：只描述Stream，操作的结果也是Stream，这样的操作称为惰性求值。惰性求值可以像建造者模式一样链式使用，最后再使用及早求值得到最终结果。
        及早求值：得到最终的结果而不是Stream，这样的操作称为及早求值。
     */

    public static void main(String[] args){
        //1、collect(Collectors.toList())，将流转换为list。还有toSet()，toMap()等。及早求值。
        List<Student> list = Stream.of(
                new Student("樱木花道", 16, 188),
                new Student("流川枫", 16, 187),
                new Student("三井寿", 17, 175)).collect(Collectors.toList());
        System.out.println(list);

        //2、filter，顾名思义，起过滤筛选的作用。内部就是Predicate接口。惰性求值。
        List<Student> listFilter = list.stream().filter(stu -> stu.getHeight() > 180).collect(Collectors.toList());
        System.out.println(listFilter);

        //3、map，转换功能，内部就是Function接口。惰性求值
        List<String> names = list.stream().map(stu -> stu.getName()).collect(Collectors.toList());
        System.out.println(names);

        //4、flatMap,将多个Stream合并为一个Stream。惰性求值
        List<Student> studentList = Stream.of(list, Arrays.asList(new Student("宫城良田", 16, 167), new Student("赤木刚宪", 18, 192)))
                .flatMap(students1 -> students1.stream()).collect(Collectors.toList());
        System.out.println(studentList);
        //调用Stream.of的静态方法将两个list转换为Stream，再通过flatMap将两个流合并为一个。

        //5、max和min，我们经常会在集合中求最大或最小值，使用流就很方便。及早求值。
        Optional<Student> max = list.stream().max(Comparator.comparing(v -> v.getAge()));
        Optional<Student> min = list.stream().min(Comparator.comparing(v -> v.getAge()));
        if(max.isPresent())
            System.out.println(max.get());
        if(min.isPresent())
            System.out.println(min.get());

        //6、sourted,排序
        Comparator<Student> comparator = (s1, s2) -> s2.getHeight().compareTo(s1.getHeight());
        List<Student> sortedStudents = list.stream().sorted(Comparator.comparing(Student::getHeight).reversed()).collect(Collectors.toList());
        List<Student> sortedStudents2 = list.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(sortedStudents);
        System.out.println(sortedStudents2);

        //7、count，统计功能，一般都是结合filter使用，因为先筛选出我们需要的再统计即可。及早求值
        long count = list.stream().filter( s -> s.getAge() < 45).count();
        System.out.println("年龄小于45岁的有：" + count + "人");

        //8、reduce，reduce 操作可以实现从一组值中生成一个值。在上述例子中用到的 count 、 min 和 max 方法，因为常用而被纳入标准库中。事实上，这些方法都是 reduce 操作。及早求值。
        Integer reduce = Stream.of(1, 2, 3, 4).reduce(0, (acc, x) -> acc+ x);
        System.out.println("和为：" + reduce);
    }
}
