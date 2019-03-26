package myTest.maploop;

public class Student {
	private String name;
	private String age;
	Student(){
		System.out.println("构造函数初始化。。。。");
//		new LittleStudent();
	}
//	class LittleStudent{
//		{
//			System.out.println("调用了内部类");
//			setName("小孩子");
//			setAge("年龄");
//		}
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
