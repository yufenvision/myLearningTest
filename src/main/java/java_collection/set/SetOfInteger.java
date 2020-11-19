package java_collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author: dyf
 * @Date: 2019/9/17 11:15
 * @Description: Set具有与Collection完全一样的接口，实际上Set就是Collection,只是行为不同
 */
public class SetOfInteger {
    public static void main(String[] args){
        Random random = new Random();
        Set<Integer> intSet = new HashSet<>();
        for(int i=0; i < 10000; i++){
            intSet.add(random.nextInt(30));
        }
        System.out.println(intSet);
    }
}
