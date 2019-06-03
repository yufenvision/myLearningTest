package designmode.adapter.ducksample;

/**
 * @Author: dyf
 * @Date: 2019/6/3 22:33
 * @Description:
 */
public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TuekeyAdapter(turkey);

        System.out.println("火鸡说：...");
        turkey.gobble();
        turkey.fly();

        System.out.println("鸭子说：。。。");
        testDuck(duck);

        System.out.println("火鸡适配器说:");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
