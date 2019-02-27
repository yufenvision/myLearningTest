package practise;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div(1,0);
	}
	
	public static void div(int a, int b)throws ArithmeticException{
		System.out.println(a/b);
	}
}
