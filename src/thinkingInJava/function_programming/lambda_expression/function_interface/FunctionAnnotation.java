package thinkingInJava.function_programming.lambda_expression.function_interface;

/**
 * @Author: dyf
 * @Date: 2019/7/9 23:16
 * @Description:
 */
public class FunctionAnnotation {
    public String goodbye(String arg){
        return "Goodbye, " + arg;
    }
    public static void main(String[] args){
        FunctionAnnotation fa = new FunctionAnnotation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;
//        Functional fac = fa;//不相容
        Functional f1 = a -> "Functional再见，" + a;
        FunctionalNoAnn fnal = a-> "FunctionalNoAnn再见" + a;
        //@FunctionalInterface 注解是可选的; Java 将 Functional 和 FunctionalNoAnn 视为主方法中的函数接口。
        //@FunctionalInterface 的值在 NotFunctional 的定义中可见：接口中的如果有多个方法则会产生编译时错误消息。
    }
}
