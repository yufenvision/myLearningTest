package myPractise.temporaryTest;

public class Student {
	//private Long id;
	private String name;
	private int age;
	private Character sex;
	private String major;
	public Student(){}
	public Student(String name, int age, Character sex, String major) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.major = major;
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
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", major=" + major + "]";
	}
	
}
