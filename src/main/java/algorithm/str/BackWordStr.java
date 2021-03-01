package algorithm.str;

import java.util.*;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/2/8 09:54
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 *
 * 示例 2：
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 * 示例 3：
 * 输入：s = "a"
 * 输出："a"
 *
 * 示例 4：
 * 输入：s = "ac"
 * 输出："a"
 *
 */
public class BackWordStr {
    public static void main(String[] args) {
        String s = "ccc";
        String s2 = "aacabdkacaa";
        //System.out.println(s.lastIndexOf('c'));
        System.out.println(longestPalindromeNew(s));

    }


    public static String longestPalindromeNew(String s) {
        /*
        * 遍历s
        *   if(map.containKey(s.charAt(i))){
        *       if((i-map.get(s.charAt(i))) > max)max = i - v1;maxStr = i的值
        *   }
        *
        * map.put(s.charAt(i), i);
        * s.subString(s.indexOf(s.charAt(i)), s.lastIndexOf(s.charAt(i)))
        */
        Map<Character, Integer> map = new HashMap<>();
        Character maxStr = null;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int temp = i - map.get(s.charAt(i));
                if(temp > max){
                    max = temp;
                    maxStr = s.charAt(i);
                }
            }
            map.put(s.charAt(i), i);
        }
        if(maxStr == null)return s.substring(0,1);
        return s.substring(s.indexOf(maxStr), s.lastIndexOf(maxStr) + 1);
    }



    public static String longestPalindrome(String s) {
        /*
        * 遍历s
        *
        *   假如map包含该k,v2 = v1,
        *       if((i-v1) > max)max = i - v1;maxStr = i的值
        *   放入map，k为值，v为2维数组，v1永远放最新
        *
        *   int[] value = map.get(maxStr);
        *   int num = value[0] - value[1];
        *   if(num > 0)return s.subString(value[1], value[0] + 1);
        * */
        Map<Character, Integer[]> map = new HashMap<>();
        Character maxStr = null;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                Integer[] value = map.get(s.charAt(i));
                if(i - value[0] > max){
                    max = i - value[0];
                    maxStr = s.charAt(i);
                }
                value[1] = value[0];
            }
            Integer[] val = map.get(s.charAt(i)) == null ? new Integer[2] : map.get(s.charAt(i));
            val[0] = i;
            map.put(s.charAt(i), val);
        }
        if(maxStr != null){
            Integer[] value = map.get(maxStr);
            int num = value[0] - value[1];
            if(num > 0)return s.substring(value[1], value[0] + 1);
        }
        return s.length() > 0 ? s.substring(0,1) : "";
    }

}
