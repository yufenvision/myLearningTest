package practise;

public class TestDemo1 extends A{

	public static void prt() {
        System.out.println("2");//这里无法覆写，因为有父类该方法有static修饰
    }
    public TestDemo1() {
        super();
        System.out.println("B");
    }
    
    public static void main(String[] args) {
        A a = new TestDemo1();  //——打印AB 调用B的构造方法，在B的构造方法里面存在隐似的调用父类的无参的构造方法 super();
        a.prt();
        a = new A();  //——打印A  直接调用A的无参构造方法        
    }


}
class A{
	public static void prt() {
        System.out.println("1");
    }
    public A() {
        System.out.println("A");
    }

}