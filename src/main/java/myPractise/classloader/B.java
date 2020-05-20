package myPractise.classloader;

public class B extends A{
	
	public B(){
		System.out.println("B类构造方法");
	}
	
	static{
		System.out.println("B类静态代码块");
	}
	
}
