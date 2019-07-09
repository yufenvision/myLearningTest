package thinkingInJava.function_programming.lambda_expression.function_interface;

/**
 * @Author: dyf
 * @Date: 2019/7/9 23:00
 * @Description: 在编写接口时，可以使用 @FunctionalInterface 注解强制执行此“函数方法”模式：
 */
@FunctionalInterface
interface Functional {
    String sayGoodBye(String msg);
}
