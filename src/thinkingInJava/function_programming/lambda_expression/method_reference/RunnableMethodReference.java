package thinkingInJava.function_programming.lambda_expression.method_reference;

/**
 * @Author: dyf
 * @Date: 2019/7/9 19:41
 * @Description:
 * Runnable 接口自 1.0 版以来一直在 Java 中，因此不需要导入。它也符合特殊的单方法接口格式：它的方法 run() 不带参数，也没有返回值。
 * 因此，我们可以使用 Lambda 表达式和方法引用作为 Runnable：
 */
public class RunnableMethodReference {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名函数");
            }
        }).start();

        new Thread(() -> {
            System.out.println("拉姆达表达式");
        }).start();

        new Thread(Go::go).start();

    }
}
