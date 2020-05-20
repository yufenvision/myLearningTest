package myPractise.javaBasic;

public abstract class AbstractClass {
	
	static boolean Paddy;
	abstract void say();
	
	public void eat(){
		System.out.println("吃东西");
	}
	
	public static void main(String[] args) {
		System.out.println(Paddy);
	}
}
