package gather;

public class StudentTree implements Comparable<StudentTree> {
	private String name;
	private int age;
	public StudentTree(String name, int age) {
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
	
	@Override
	public int compareTo(StudentTree s) {
		//StudentTree s = (StudentTree)o;
		if(this.age<s.age){
			return -1;
		}else if(this.age>s.age){
			return 1;
		}else{
			//比较姓名，姓名如何比较
			return this.name.compareTo(s.name);
		}	
	}
	//覆写toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"-"+this.age;
	}
	
}
