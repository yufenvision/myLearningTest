package thinkingInJava.test;
/**
* @author 作者 dyf:
* @version 创建时间：2019年3月26日 上午11:06:44
*/
public class TestOther {
	public static void main(String[] args) {
		
		TestSome t1 = new TestSome();
		TestSome t2 = new TestSome();
		
		t1.i++;
		
		System.out.println(t1.i);
		System.out.println(t2.i);
		
	}
}
