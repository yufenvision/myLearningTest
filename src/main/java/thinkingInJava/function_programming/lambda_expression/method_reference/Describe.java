package thinkingInJava.function_programming.lambda_expression.method_reference;

/**
 * @Author: dyf
 * @Date: 2019/7/8 21:53
 * @Description:
 */
class Describe {
    void show(String msg){//show() 的签名（参数类型和返回类型）符合 Callable 的 call() 的签名。
        System.out.println(msg);
    }
}
