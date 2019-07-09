package thinkingInJava.function_programming.lambda_expression.method_reference.unbound_constructor_reference;

/**
 * @Author: dyf
 * @Date: 2019/7/9 21:52
 * @Description: 关于未绑定方法，和构造方法的引用
 */
public class Dog {
    String name;
    int age = -1;//For "unknow"
    Dog() { name = "stray"; }
    Dog(String nm) { name = nm; }
    Dog(String nm, int yrs) { name = nm; age = yrs; }

    void bark(String msg){
        System.out.println(age + "岁的" + name + "狗在吠: " + msg);
    }

    void two(int i, double d) {
        System.out.println(this.getClass() + "接收2个参数");
    }
    void three(int i, double d, String s) { System.out.println("接收3个参数");}
    void four(int i, double d, String s, char c) { System.out.println("接收4个参数");}
}
