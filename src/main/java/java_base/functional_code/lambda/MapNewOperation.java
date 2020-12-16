package java_base.functional_code.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: dyf
 * @Date: 2020/12/9 22:44
 * @Description:
 */
public class MapNewOperation {


    public static void main(String[] args) {
        /**
         *  Maps
         *  前面提到过，Map 类型不支持 streams，不过Map提供了一些新的有用的方法来处理一些日常任务。Map接口本身没有可用的 stream（）方法，
         *  但是你可以在键，值上创建专门的流或者通过 map.keySet().stream(),map.values().stream()和map.entrySet().stream()。
         *  此外,Maps 支持各种新的和有用的方法来执行常见任务。
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "000");
        map.put(1, null);
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);//值不存在,也就是不为null才插入
        }

        map.forEach((id, val) -> System.out.println(val));//val0 val1 val2 val3 val4 val5 val6 val7 val8 val9
        //putIfAbsent 阻止我们在null检查时写入额外的代码;forEach接受一个 consumer 来对 map 中的每个元素操作。

        //此示例显示如何使用函数在 map 上计算代码：
        map.computeIfPresent(3, (num, val) -> val + num);//值不为null则计算
        map.get(3);             // val33

        map.computeIfPresent(9, (num, val) -> null);//9的值不为null,才移除掉9
        map.containsKey(9);     // false

        map.computeIfAbsent(23, num -> "val" + num);//23的值为null，才计算
        map.containsKey(23);    // true

        map.computeIfAbsent(3, num -> "bam");
        map.get(3);             // val33
        //接下来展示如何在Map里删除一个键值全都匹配的项：

        map.remove(3, "val3");//key为3的value等于val3才移除
        map.get(3);             // val33
        map.remove(3, "val33");
        map.get(3);             // null
        //另外一个有用的方法：

        String str = map.getOrDefault(42, "not found");  // not found
        System.out.println(str);
        //对Map的元素做合并也变得很容易了：

        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        map.get(9);             // val9
        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        map.get(9);             // val9concat
        //Merge 做的事情是如果键名不存在则插入，否则则对原键对应的值做合并操作并重新插入到map中。


    }

}
