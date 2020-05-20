package myPractise.polymorphic;

public class Test {
	public static void main(String[] args) {
		
		Animal an = new Cat();
		//只有非静态的成员方法,编译看左边,运行看右边 
		
		//成员方法=编译看左边(父类)，运行看右边(子类)。动态绑定
		an.eat();
		//静态方法=编译看左边(父类)，运行看左边(父类)。
		an.sleep();
		
		an.run();
		
		//成员变量=编译看左边(父类),运行看左边(父类)
		System.out.println(an.num);
		System.out.println(an.age);
		
//		an.catchMouse();
//		System.out.println(an.name);
		
	}
}
