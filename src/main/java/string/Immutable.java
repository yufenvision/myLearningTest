package string;/**
 * @Author: dyf
 * @Date: 2019/4/28 16:23
 * @Description:
 */

import java.util.Arrays;

/**
 * @Author: dyf
 * @Date: 2019/4/28 16:23
 * @Description:
 */
public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();//由于String是不可变对象，所以这里实际返回的是一个新的String对象的引用
//        return s.substring(0,s.indexOf('e'));
    }

    public static String[] trans(String[] strs){
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].toUpperCase();
        }
        return strs;//这里返回的是strs的引用，strs本身已经被改变
    }

    public static void main(String[] args){
        String q = "hello";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);

        String[] strs = {"h","e","l","l","o"};
        System.out.println(Arrays.asList(strs));
        String[] strs2 = trans(strs);
        System.out.println(Arrays.asList(strs2));
        System.out.println(Arrays.asList(strs));
    }
}
