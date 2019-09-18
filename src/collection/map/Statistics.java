package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author: dyf
 * @Date: 2019/9/18 14:59
 * @Description:
 */
public class Statistics {
    public static void main(String[] args){
        Random rand = new Random();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++){
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }

}
