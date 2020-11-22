package java_collection.map;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Author: dyf
 * @Date: 2020/11/21 13:55
 * @Description:
 */
public class HashMapTest {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap();
        map.put("美团","小妹");
        String value = map.put("美团","小林");
        System.out.println(value);

    }

}
