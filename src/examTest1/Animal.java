package examTest1;

public class Animal {
	String name = "ĳĳ����";
	void sleep(){
		System.out.println("˯����zzzzzzz");
	}
}

class Fish extends Animal implements Swimmable{
	Fish(){}
	Fish(String name){
		this.name = name;
		System.out.println("����һֻ��"+name);
	}
	@Override
	public void swim() {
		System.out.println(this.name+"������Ӿ-----");
	}
}
class Cat extends Animal implements Walkable{
	Cat(){}
	Cat(String name){
		this.name = name;
		System.out.println("����һֻ��"+name);
	}
	@Override
	public void walk() {
		System.out.println(name+"������run~~run~~run");
	}
	void climb(){
		System.out.println(name+"��������Ӵ");
	}
}
class Tiger extends Animal implements Swimmable,Walkable{
	Tiger(){}
	Tiger(String name){
		this.name = name;
		System.out.println("����һֻ��"+name);
	}
	@Override
	public void walk() {
		System.out.println(name+"������run~~run~~run");
	}

	@Override
	public void swim() {
		System.out.println(name+"������Ӿ-----");
	}
	
	void eatPerson(){
		System.out.println(name+"�����ǻ���˵�Ӵ");
	}
}

