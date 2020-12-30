package java_base.i_plusplus;

public class PlusTest {
	static int x,y;
	static {
		x = 5;
		int y = 10;
	}
	
	public static void main(String[] args) {
		x--;
		myMethod();
		System.out.println(x+y + ++x);
	}
	
	public static void myMethod(){
		y = x++ + ++x;
	}
}
