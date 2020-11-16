package collection.map;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2020/11/16 09:46
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<Person, String> treeMap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        treeMap.put(new Person("人1", 44), "人1");
        treeMap.put(new Person("人2", 19), "人2");
        treeMap.put(new Person("人3", 8), "人3");
        treeMap.put(new Person("人4", 34), "人4");

        System.out.println(treeMap);

    }
}


@Data
@AllArgsConstructor
class Person{
    private String name;
    private Integer age;
}