package thinkingInJava.function_programming.lambda_expression.method_reference;

/**
 * @Author: dyf
 * @Date: 2019/7/8 21:54
 * @Description:
 */
public class MethodReferences {
    static void hello(String name){//hello() 也符合 call() 的签名。
        System.out.println("Hello, " + name);
    }
    static class Description{
        String about;
        Description(String about) {
            this.about = about;
        }
        void help(String msg) { // 就像是 help()，静态内部类中的非静态方法。
            System.out.println(about + " " + msg);
        }
    }
    static class Helper {
        static void assist(String msg) { // assist() 是静态内部类中的静态方法。
            System.out.println(msg);
        }
    }
    public static void main(String[] args){
        Describe d = new Describe();
        Callable c = d :: show;//[6]我们将 Describe 对象的方法引用赋值给 Callable ，它没有 show() 方法，而是 call() 方法。 但是，Java 似乎接受用这个看似奇怪的赋值，因为方法引用符合 Callable 的 call() 方法的签名。
        c.call("call()");//我们现在可以通过调用 call() 来调用 show()，因为 Java 将 call() 映射到 show()。

        c = MethodReferences::hello; // [8]这是一个静态方法引用。
        c.call("Bob");

        c = new Description("valuable")::help; // 这是 [6] 的另一个版本：附加到存活对象的方法的方法参考，有时称为绑定方法引用。
        c.call("information");

        c = Helper::assist; // 最后，获取静态内部类的方法引用的操作与 [8] 中外部类方式一样。
        c.call("Help!");
    }
}
