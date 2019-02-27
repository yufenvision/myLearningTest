package gather;

public class StudentTree1{
	String name;
	int age;
	public StudentTree1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//¸²Ð´toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"-"+this.age;
	}
	
}
