package collection;

import java.util.*;

/**
 * @Author: dyf
 * @Date: 2019/9/10 10:51
 * @Description:
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map){
        map.put("rat", "ratName");
        map.put("cat", "catName");
        map.put("dog", "dogName1");
        map.put("dog", "dogName2");
        return map;
    }

    public static void main(String[] args){
        System.out.println(fill(new ArrayList<>()));//按照被插入的顺序保存元素
        System.out.println(fill(new LinkedList<>()));//按照被插入的顺序保存元素
        System.out.println(fill(new HashSet<>()));//存储顺序无实际意义，只需知道这种技术是最快的获取元素的方式
        System.out.println(fill(new TreeSet<>()));//按照比较结果升序存储
        System.out.println(fill(new LinkedHashSet<>()));//按照被添加的顺序保存对象
        System.out.println(fill(new HashMap<>()));//提供最快的查找技术，也没有按照任何明显的顺序来保存
        System.out.println(fill(new TreeMap<>()));//按照比较结果升序保存键
        System.out.println(fill(new LinkedHashMap<>()));//按照插入顺序保存键，同时还保留了HashMap的查询速度
    }

}
