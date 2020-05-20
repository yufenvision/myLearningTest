package myPractise.innerClass;

/**
 * 匿名内部类
 * 		就是内部类的简化写法。
 * 前提：存在一个类或者接口
 * 		这里的类可以是具体类也可以是抽象类
 * 格式：
 * 		new 类名或者接口名(){
 * 			重写方法；
 * 	  	}
 * 本质是什么呢？
 * 		是一个继承了该类或者实现了该接口的子类匿名对象
 */
interface Inter{
	public void show();
	public void show2();
}
class Outer{
	public void method(){
		//一个方法
//		new Inter(){
//			@Override
//			public void show() {
//				System.out.println("show");
//				
//			}
//		}.show();
		//二个方法的时候
//		new Inter(){
//			public void show(){
//				System.out.println("show");
//			}
//			public void show2(){
//				System.out.println("show2");
//			}
//		}.show();
//		
//		new Inter(){
//			public void show(){
//				System.out.println("show");
//			}
//			public void show2(){
//				System.out.println("show2");
//			}
//		}.show2();
		
		//如果我是很多个方法，就很麻烦了
		//那么，我们有没有改进的方案呢？
		//多态！编译时看左边，运行时看右边
		Inter i  = new Inter(){
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		};
		i.show();
		i.show2();
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
		
	}
}
