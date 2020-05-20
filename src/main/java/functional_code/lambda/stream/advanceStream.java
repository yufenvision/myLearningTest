package functional_code.lambda.stream;

import functional_code.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: dyf
 * @Date: 2019/7/22 22:24
 * @Description: 高级集合类收集器
 */
public class advanceStream {
    public static void main(String[] args){
        List<Student> list = Stream.of(
                new Student("樱木花道", 16, 188),
                new Student("流川枫", 16, 187),
                new Student("三井寿", 17, 175),
                new Student("宫城良田", 16, 167),
                new Student("赤木刚宪", 18, 192)).collect(Collectors.toList());
        System.out.println(list);
       /*
        1、转换成值：收集器，一种通用的、从流生成复杂值的结构。只要将它传给 collect 方法，所有的流就都可以使用它了。
        标准类库已经提供了一些有用的收集器，以下示例代码中的收集器都是从 java.util.stream.Collectors 类中静态导入的。
        */
        OutstandingClass outstandingClass1 = new OutstandingClass("湘北", list);
        List<Student> list2 = new ArrayList<>(list);
        list2.remove(1);
        OutstandingClass outstandingClass2 = new OutstandingClass("少人的湘北", list2);

       /*
        2、转换成块，常用的流操作是将其分解成两个集合，Collectors.partitioningBy帮我们实现了，接收一个Predicate函数式接口。
        */

       /*
        3、数据分组，数据分组是一种更自然的分割数据操作，与将数据分成 ture 和 false 两部分不同，可以使用任意值对数据分组。Collectors.groupingBy接收一个Function做转换。
        */

       /*
        4、字符串拼接，如果将所有学生的名字拼接起来，怎么做呢？通常只能创建一个StringBuilder，循环拼接。使用Stream，使用Collectors.joining()简单容易。
        */
        String names = list.stream().map(Student::getName).collect(Collectors.joining(","));
        System.out.println(names);
    }
}
