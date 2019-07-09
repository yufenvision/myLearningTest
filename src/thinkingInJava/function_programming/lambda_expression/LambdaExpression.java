package thinkingInJava.function_programming.lambda_expression;

/**
 * @Author: dyf
 * @Date: 2019/7/9 23:06
 * @Description:
 */
public class LambdaExpression {
    static Body bod = h -> h + "No Parens!";//当只用一个参数，可以不需要括号 ()。 然而，这是一个特例。
    static Body bod2 = (h) -> h + "More details";//正常情况使用括号 () 包裹参数。 为了保持一致性，也可以使用括号 () 包裹单个参数，虽然这种情况并不常见。
    static Description description = () -> "没有参数的描述";// 如果没有参数，则必须使用括号 () 表示空参数列表。
    static Multi multi = (h,n) -> h + n;//对于多个参数，将参数列表放在括号 () 中。

    static Description moreLines = () -> {
        System.out.println("moreLines");
        return "from moreLines()";
    };

    public static void main(String[] args){
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi!"));
        System.out.println(description.brief());
        System.out.println(multi.twoArg("Pi! ", 3.14159));
        System.out.println(moreLines.brief());
    }
}
