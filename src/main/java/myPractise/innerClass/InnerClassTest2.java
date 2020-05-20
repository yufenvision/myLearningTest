package myPractise.innerClass;

/**
 * 匿名内部类在开发中的使用
 *
 */
interface Person{
	public void study();
	
}

class PersonDemo{
	//接口名作为形式参数
	//其实这里需要的不是接口，而是改接口的实现类对象
	public void method(Person p){
		p.study();
	}
}

//实现类
class Student implements Person{

	@Override
	public void study() {
		System.out.println("好好学习，天天向上");
	}
}


public class InnerClassTest2 {
	
	public static void main(String[] args) {
		//测试
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		
		//匿名内部类在开发中的使用
		pd.method(new Person(){

			@Override
			public void study() {
				System.out.println("匿名内部类的使用：好好学习，天天向上");
			}
			
		});
	}
}
