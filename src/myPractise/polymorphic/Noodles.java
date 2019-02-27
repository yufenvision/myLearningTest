package myPractise.polymorphic;

public class Noodles extends Food implements IFood{
	String name = "面条";
	static String attribute = "面条的静态属性";
	
	public String getName() {
		return name;
	}

	@Override
	public String getFoodName() {
		return this.getName();
	}
	
	public static void staticMethod(){
		System.out.println("面条静态方法");
	}	
}
