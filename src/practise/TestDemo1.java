package practise;

public class TestDemo1 extends A{

	public static void prt() {
        System.out.println("2");//�����޷���д����Ϊ�и���÷�����static����
    }
    public TestDemo1() {
        super();
        System.out.println("B");
    }
    
    public static void main(String[] args) {
        A a = new TestDemo1();  //������ӡAB ����B�Ĺ��췽������B�Ĺ��췽������������Ƶĵ��ø�����޲εĹ��췽�� super();
        a.prt();
        a = new A();  //������ӡA  ֱ�ӵ���A���޲ι��췽��        
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