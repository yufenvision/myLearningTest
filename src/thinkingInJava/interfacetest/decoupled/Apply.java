package thinkingInJava.interfacetest.decoupled;

/**
 * @Author: dyf
 * @Date: 2019/7/4 10:54
 * @Description: 创建一个能够根据所传递的参数对象的不同而具有不同行为的方法，被称为策略模式
 */
public class Apply {
    public static void process(Processor p, Object s){//Processer对象就是一个策略
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definiton incorrect";
    public static void main(String[] args){
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}
