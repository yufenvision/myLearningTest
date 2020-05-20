package thinkingInJava.function_programming.lambda_expression.recursion;

/**
 * @Author: dyf
 * @Date: 2019/7/8 21:40
 * @Description: 斐波拉契数列用lambda表达式来实现
 */
public class RecursiveFibonacci {
    IntCall fib;
    RecursiveFibonacci() {
        fib = n -> n == 0 ? 0 :
                   n == 1 ? 1 :
                   fib.call(n-1) + fib.call(n-2);
    }
    int fibonacci(int n) { return fib.call(n); }
    public static void main(String[] args) {
        RecursiveFibonacci rf = new RecursiveFibonacci();
        for(int i = 0; i <= 10; i++)
            System.out.println(rf.fibonacci(i));
    }
}
