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
		System.out.println("�����ϰ�");
		System.out.println("�ҵ������ǣ�"+s);
	}
}

class Son extends Father{
	Son(){
		super();
	}
	String name;
	Son(String name){
		super(name);
		System.out.println("���Ƕ���");
	}
}