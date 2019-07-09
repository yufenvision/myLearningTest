package thinkingInJava.function_programming.lambda_expression.method_unbound;

/**
 * @Author: dyf
 * @Date: 2019/7/9 20:07
 * @Description: 为了说明这一点，我将类命名为 This ，函数方法的第一个参数则是 athis，但是你应该选择其他名称以防止生产代码混淆。
 */
public class MultiUnbound {
    public static void main(String[] args){
        TwoArgs twoargs = This::two;
        ThreeArgs threeargs = This::three;
        FourArgs fourargs = This::four;
        This athis = new This();
        twoargs.call2(athis, 11, 3.14);//必须是函数方法的第一个参数为方法对象
        threeargs.call3(athis, 11, 3.14, "Three");
        fourargs.call4(athis, 11, 3.14, "Four", 'Z');
    }
}
