package myTest.anyTest;

public class TestReturn {
	public static void main(String[] args) {
		
		ha();
	}
	
	
	
	public static void re(int x){
		System.out.println("11111");
		if(x == 1){
			return;
		}
		System.out.println("我是re方法");
		
	}
	
	
	public static void ha(){
		
		System.out.println("我是ha方法");
		re(1);
		System.out.println("ha方法结束了");
	}
}
