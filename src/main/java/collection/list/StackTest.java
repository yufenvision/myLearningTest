package collection.list;

/**
 * @Author: dyf
 * @Date: 2019/9/17 10:05
 * @Description:
 */
public class StackTest {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        System.out.println(stack);
        while(!stack.empty()){//弹出栈顶，并打印
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        System.out.println(stack);
    }
}
