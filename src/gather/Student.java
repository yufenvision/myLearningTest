package gather;

public class Student {
	String name;
	int age;
	public Student(String name,int age){
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
	//覆写equals方法
	//比较两个对象是否是一样
	//应该比较姓名和年龄，如果一样的话，就表示同一个
	@Override
	public boolean equals(Object obj) {
		//判断是否为空
		if(null == obj){
			return false;
		}
		//判断传入的是否是学生类
		if(!(obj instanceof Student)){
			return false;
		}
		//是否是同一个对象
		if(this == obj){
			return true;
		}
		
		Student s = (Student)obj;
		if(this.name.equals(s.getName()) && this.age == s.getAge()){
			return true;
		}else{
			return false;
		}
	}
	
	//覆写hashCode
	//age int/ name怎么取int String.hashCode()
	@Override
	public int hashCode() {
		
		return this.age + this.name.hashCode();
	}
	
	@Override
	public String toString() {
		
		return this.name+"-"+this.age;
	}
	
}
