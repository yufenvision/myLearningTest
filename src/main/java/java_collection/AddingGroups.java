package java_collection;

import java.util.*;

/**
 * @Author: dyf
 * @Date: 2019/9/9 17:28
 * @Description: 添加一组元素，Arrays.asList的输出其底层是数组，因此不能调整尺寸
 */
public class AddingGroups {
    public static void main(String[] args){
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));//首选方法，快的多
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
//        list.add(20);
        System.out.println(collection);
        System.out.println(list);
    }
}
