package thinkingInJava.innerclass;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Author: dyf
 * @Date: 2019/6/30 22:39
 * @Description:
 */
public class Outer {
    private String name;
    public Outer(String name) {
        this.name = name;
        System.out.println("我是外部类");
    }

    private class Inner{
        public void show(){
            System.out.println("我是内部类");
        }
        public String name(){
            return "从内部类调用：外部类属性name = " + Outer.this.name;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args){
        Outer o = new Outer("外部类");
        Inner i = o.new Inner();
        System.out.println(i.name());
    }
}
