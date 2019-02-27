package test;

public class ConstructorTest {

	public static void main(String[] args) {
		Son s = new Son("son");
	}

}

class Father{
	Father(){}
	String s;
	Father(String s){
		System.out.println("我是老爸");
		System.out.println("我的名字是："+s);
	}
}

class Son extends Father{
	Son(){
		super();
	}
	String name;
	Son(String name){
		super(name);
		System.out.println("我是儿子");
	}
}