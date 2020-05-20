package myPractise.polymorphic;

//实体人类
public class Person {
	
	//没有多态时候，写多个方法重载
	public void eatFood(Noodles food){
		System.out.println("我在吃"+food.getName());
	}
	
	public void eatFood(Rice food){
		System.out.println("我在吃"+food.getName());
	}
	
//					.
//					.
//					.
//					.
//					.
//			很多方法重载......
	
	//用多态，只创建一个方法
	public void eatFood(Food food){
		System.out.println("我在吃"+food.getName());
	}
	public void eatIFood(IFood food){
		System.out.println("我在吃"+food.getFoodName());
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		//没有多态时
		System.out.println("-------------没有多态时");
		Noodles n = new Noodles();
		Rice r = new Rice();
		p.eatFood(n);
		p.eatFood(r);
		System.out.println("-------------用继承实现多态时");
		
		//用继承实现多态时
		Food f = new Noodles();
		p.eatFood(f);
		f = r;
		p.eatFood(f);
		
		System.out.println("-------------用接口实现多态时");
		//用接口实现多态时
		Person pi = new Person();
		IFood fi = new Noodles();
		pi.eatIFood(fi);
		fi = new Rice();
		pi.eatIFood(fi);
		
		System.out.println("------");
		
		//关于多态应用中，成员变量，静态成员变量，静态方法，与非静态方法的编译时和运行时情况
		
		Food ff = new Noodles();
		System.out.println(ff.name);//成员变量编译时看左边，运行时看左边
		System.out.println(ff.attribute);//静态成员变量编译时看左边，运行时看左边
		ff.staticMethod();//静态方法编译时看左边，运行时看左边
		System.out.println(ff.getName());//只有非静态方法编译时看左边，运行时看右边！
		
		IFood ffi = new Noodles();
		System.out.println(ffi.attribute);
	}
}
