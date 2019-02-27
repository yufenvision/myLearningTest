package examTest1;

public class Animal {
	String name = "某某动物";
	void sleep(){
		System.out.println("睡觉了zzzzzzz");
	}
}

class Fish extends Animal implements Swimmable{
	Fish(){}
	Fish(String name){
		this.name = name;
		System.out.println("我是一只："+name);
	}
	@Override
	public void swim() {
		System.out.println(this.name+"：会游泳-----");
	}
}
class Cat extends Animal implements Walkable{
	Cat(){}
	Cat(String name){
		this.name = name;
		System.out.println("我是一只："+name);
	}
	@Override
	public void walk() {
		System.out.println(name+"：会跑run~~run~~run");
	}
	void climb(){
		System.out.println(name+"：会爬树哟");
	}
}
class Tiger extends Animal implements Swimmable,Walkable{
	Tiger(){}
	Tiger(String name){
		this.name = name;
		System.out.println("我是一只："+name);
	}
	@Override
	public void walk() {
		System.out.println(name+"：会跑run~~run~~run");
	}

	@Override
	public void swim() {
		System.out.println(name+"：会游泳-----");
	}
	
	void eatPerson(){
		System.out.println(name+"：可是会吃人的哟");
	}
}

