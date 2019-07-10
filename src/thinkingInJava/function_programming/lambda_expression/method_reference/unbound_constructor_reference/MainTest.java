package thinkingInJava.function_programming.lambda_expression.method_reference.unbound_constructor_reference;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author: dyf
 * @Date: 2019/7/9 22:44
 * @Description:
 * Dog 有三个构造函数，函数接口内的 make() 方法反映了构造函数参数列表（ make() 方法名称可以不同）。
 * 注意我们如何对 [1]，[2] 和 [3] 中的每一个使用 Dog :: new。 这 3 个构造函数只有一个相同名称：:: new，但在每种情况下都赋值给不同的接口。
 * 编译器可以检测并知道从哪个构造函数引用。编译器能识别并调用你的构造函数（ 在本例中为 make()）。
 */
public class MainTest {
    public static void main(String[] args){
        //构造函数引用
        MakeNoArgs mna = Dog::new; // [1]
        Make1Arg m1a = Dog::new;   // [2]
        Make2Args m2a = Dog::new;  // [3]

        Dog dn = mna.make();
        Dog d1 = m1a.make("Comet");
        Dog d2 = m2a.make("Ralph", 4);
        System.out.println("狗名：" + dn.name + "， 狗龄：" + dn.age);
        System.out.println("狗名：" + d1.name + "， 狗龄：" + d1.age);
        System.out.println("狗名：" + d2.name + "， 狗龄：" + d2.age);

        //未绑定的方法引用是指没有关联对象的普通（非静态）方法。 使用未绑定的引用之前，我们必须先提供对象：
        //未绑定方法的引用，为了说明这一点，我将类命名为 Dog ，函数方法的第一个参数则是 athis。
        TwoArgs twoargs = Dog::two;
        ThreeArgs threeargs = Dog::three;
        FourArgs fourargs = Dog::four;
        Dog athis = new Dog();
        twoargs.call2(athis, 11, 3.14);//必须是函数方法的第一个参数为方法对象
        threeargs.call3(athis, 11, 3.14, "Three");
        fourargs.call4(athis, 11, 3.14, "Four", 'Z');

        Supplier<Dog> bark = Dog::new;
        bark.get().bark("生产者函数");
        Consumer<String> bark1 = new Dog()::bark;
        bark1.accept("消费者函数");
        Function<String, Dog> f = s -> new Dog(s);
        f.apply("function").bark("function构造.....");

        Consumer c1 = System.out::println;
        Consumer c2 = s -> System.out.println(s + " from c2");
        c1.andThen(c2).accept("入参");
    }
}
