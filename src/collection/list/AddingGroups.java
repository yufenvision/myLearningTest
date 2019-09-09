package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Author: dyf
 * @Date: 2019/9/9 17:28
 * @Description: 添加一组元素
 */
public class AddingGroups {
    public static void main(String[] args){
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
    }
}
