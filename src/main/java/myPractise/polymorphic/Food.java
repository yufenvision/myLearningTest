package myPractise.polymorphic;

public class Food {
	String name = "食物";
	static String attribute = "食物的静态属性";

	public String getName() {
		return name;
	}

	public static void staticMethod(){
		System.out.println("食物静态方法");
	}
	
}
