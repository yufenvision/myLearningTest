package thinkingInJava.function_programming.lambda_expression;

/**
 * @Author: dyf
 * @Date: 2019/7/8 21:41
 * @Description: 单行lambda表达式结果自动返回，如果使用return非法。多行lambda需要花括号和return
 */
public class RecursiveFactorial {
    static IntCall fact;
    public static void main(String[] args){
        //整数 n 的阶乘将所有小于或等于 n 的正整数相乘。 阶乘函数是一个常见的递归示例：
        fact = n -> n == 0 ? 1 : n*fact.call(n - 1);
        for(int i = 0; i <= 10; i++)
            System.out.println(fact.call(i));
    }
}
