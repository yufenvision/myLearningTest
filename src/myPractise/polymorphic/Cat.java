package myPractise.polymorphic;

public class Cat extends Animal{
	
	int num = 30;
	static int age = 60;
	
	String name = "汤姆猫";
	
	public void eat(){
		System.out.println("猫吃饭");
	}
	
	public static void sleep(){
		System.out.println("猫睡觉");
	}
	
	public void catchMouse(){
		System.out.println("猫抓老鼠");
	}
}
