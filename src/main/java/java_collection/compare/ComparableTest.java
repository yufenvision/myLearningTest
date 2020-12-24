package java_collection.compare;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/12/24 15:26
 */
public class ComparableTest {
    public static void main(String[] args) {
        TreeMap<Person, String> personTree = new TreeMap<>();
        personTree.put(new Person("小红",18),"xiaohong");
        personTree.put(new Person("小明",12),"xiaoming");
        personTree.put(new Person("小军",10),"xiaojun");
        personTree.put(new Person("大牛",38),"daniu");

        personTree.forEach((k,v) -> System.out.println(k));

        List<Person> list = new ArrayList<>();
        list.add(new Person("小红",18));
        list.add(new Person("小明",12));
        list.add(new Person("小军",10));
        list.add(new Person("大牛",38));
        list.sort(((o1, o2) -> o2.getAge() < o1.getAge() ? -1 : (o2.getAge() == o1.getAge() ? 0 : 1)));
        System.out.println(list);
    }
}

/**
 * person对象没有实现Comparable接⼝，所以必须实现，这样才不会出错，才可以使treemap中的数据按顺序排列
 *
 */
@Data
class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.getAge() > o.getAge()){
            return 1;
        }else if(this.getAge() < o.getAge()) {
            return -1;
        }
        return 0;
    }
}