package algorithm.str;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/2/7 10:02
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 示例 4:
 * 输入: s = ""
 * 输出: 0
 *
 * 提示：
 *     0 <= s.length <= 5 * 104
 *     s 由英文字母、数字、符号和空格组成
 *
 */
public class NoRepeatStr {

    public static void main(String[] args) {
        String str = "pwwkew";

        //System.out.println(lengthOfLongestSubstring(str));

        System.out.println(splipWindow(str));

    }

    public static int lengthOfLongestSubstring(String s) {
        int numMax = 0;
        StringBuffer sb = new StringBuffer();
        String[] strs = s.split("");
        for (int i = 0; i < strs.length; i++) {
            int num = 0;
            for (int i1 = i; i1 < strs.length; i1++) {
                if(sb.indexOf(strs[i1]) == -1){
                    num += 1;
                }else {
                    sb.setLength(0);
                    break;
                }
                sb.append(strs[i1]);
            }
            if(num >= numMax)numMax = num;
        }
        return numMax;
    }


    //滑动窗口
    public static int splipWindow(String s){
        if(s.length() == 0)return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);//只会往右边滑！
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }


    //官方的看球不懂
    public static int lengthOfLongestSubstringOffice(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }


}
