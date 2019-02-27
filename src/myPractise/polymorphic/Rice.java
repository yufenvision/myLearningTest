package myPractise.polymorphic;

public class Rice extends Food implements IFood{
	String name = "米饭";
	static String attribute = "米饭的静态属性";
	
	public String getName() {
		return name;
	}
	
	@Override
	public String getFoodName() {
		return this.getName();
	}
	
	public static void staticMethod(){
		System.out.println("米饭静态方法");
	}
}
