package myTest.singleton;

public enum SingleTon {
	
	INSTANCE,INSTANCE2;
	/*
	 * 创建enum时，编译器会自动为我们生成一个继承自java.lang.Enum的类，我们上面的enum可以简单看作：
	 * class SingleTon extends Enum{
	 * 		public static final INTANCE;
	 * 		public static final INTANCE2;
	 * 
	 * }
	 */
	static{
		INSTANCE.type = "初始化INSTANCE的某些属性";
	}
	String type;
	
	public String getType(){
		return type;
	}
	
}
