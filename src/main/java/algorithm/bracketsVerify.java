package algorithm;


import java.util.HashMap;
import java.util.Stack;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/1/18 16:26
 *  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断该字符串是否有效。
 *  有效字符串需满足：
 *      1.左括号必须用相同类型的右括号闭合。
 *      2.左括号必须以正确的顺序闭合。
 *  比如 "()"、"()[]{}"、"{[]}" 都是有效字符串，而 "(]" 、"([)]" 则不是。
 *
 *  这个问题实际是 Leetcode 的一道题目，我们可以利用栈 Stack 来解决这个问题。
 *
 *     首先我们将括号间的对应规则存放在 Map 中，这一点应该毋容置疑；
 *     创建一个栈。遍历字符串，如果字符是左括号就直接加入stack中，否则将stack 的栈顶元素与这个括号做比较，如果不相等就直接返回 false。遍历结束，如果stack为空，返回 true。
 *
 */
public class bracketsVerify {

    public static void main(String[] args) {
        String str = "{}[]()([])";

        System.out.println(isValid(str));

    }
    public static  boolean isValid(String s){
        // 括号之间的对应规则
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (mappings.containsKey(chars[i])) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }

}
