package thinkingInJava.test;
/**
* @author 作者 dyf:
* @version 创建时间：2019年3月26日 上午11:06:44
*/
public class TestOther {
	public static void main(String[] args) throws ClassNotFoundException {
		
		TestSome t1 = new TestSome();
		TestSome t2 = new TestSome();
		
		t1.i++;
		
		System.out.println(t1.i);
		System.out.println(t2.i);
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(Class.forName("thinkingInJava.test.TestOther"));
	}
}
