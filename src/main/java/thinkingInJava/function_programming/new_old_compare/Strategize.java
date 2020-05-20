package thinkingInJava.function_programming.new_old_compare;

/**
 * @Author: dyf
 * @Date: 2019/7/8 20:43
 * @Description:
 */
public class Strategize {
    Strategy strategy;
    String msg;
    public Strategize(String msg) {
        this.strategy = new Soft();// 在 Strategize 中，Soft 作为默认策略，在初始化构造函数中赋值的。
        this.msg = msg;
    }
    void communicate(){
        System.out.println(strategy.approach(msg));
    }
    void changeStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public static void main(String[] args){
        Strategy[] strategies = {
            new Strategy() {//一种略显冗长且更自发的方法是创建一个匿名内部类。即使这样，仍有相当数量的冗余代码。你总是要仔细观察：“哦，原来这样，这里使用了匿名内部类。”
                @Override
                public String approach(String msg) {
                    return msg.toUpperCase() + "!";
                }
            },
            msg -> msg.substring(0, 5),//Java 8 的 Lambda 表达式。由箭头 -> 分隔开参数和函数体，箭头左边是参数，箭头右侧是从 Lambda 返回的表达式，即函数体。这实现了与定义类、匿名内部类相同的效果，但代码少得多。
            Unrelated :: twice //Java 8 的方法引用，由 :: 区分。在 :: 的左边是类或对象的名称，在 :: 的右边是方法的名称，但没有参数列表。
        };
        Strategize s = new Strategize("Hello there");
        s.communicate();
        for (Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy);//在使用默认的 Soft strategy 之后，我们逐步遍历数组中的所有 Strategy，并使用 changeStrategy() 方法将每个 Strategy 放入 变量 s 中。
            s.communicate();//现在，每次调用 communicate() 都会产生不同的行为，具体取决于此刻正在使用的策略代码对象。我们传递的是行为，而非仅数据。
        }
    }
}
