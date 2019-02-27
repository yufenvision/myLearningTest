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
	//��дequals����
	//�Ƚ����������Ƿ���һ��
	//Ӧ�ñȽ����������䣬���һ���Ļ����ͱ�ʾͬһ��
	@Override
	public boolean equals(Object obj) {
		//�ж��Ƿ�Ϊ��
		if(null == obj){
			return false;
		}
		//�жϴ�����Ƿ���ѧ����
		if(!(obj instanceof Student)){
			return false;
		}
		//�Ƿ���ͬһ������
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
	
	//��дhashCode
	//age int/ name��ôȡint String.hashCode()
	@Override
	public int hashCode() {
		
		return this.age + this.name.hashCode();
	}
	
	@Override
	public String toString() {
		
		return this.name+"-"+this.age;
	}
	
}
