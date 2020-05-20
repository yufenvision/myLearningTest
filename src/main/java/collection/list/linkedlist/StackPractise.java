package collection.list.linkedlist;

import java.util.Stack;

/**
 * @Author: dyf
 * @Date: 2019/9/17 10:29
 * @Description: 练习："+"表示将后面的字母压进栈，"-"表示，弹出栈顶字母并打印它
 */
public class StackPractise {
    public static void main(String[] args){
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        char[] chars = str.toCharArray();
        Stack<String> stack = new Stack<>();
        for (int i=0; i<chars.length; i++){
            if(String.valueOf(chars[i]).equals("+")){
                stack.push(String.valueOf(chars[i+1]));//入栈
                System.out.println(stack);
            }
            if(String.valueOf(chars[i]).equals("-")){
                stack.pop();
                System.out.println(stack);
            }
        }
        System.out.println("====================================");
        System.out.println(stack);
    }
}
