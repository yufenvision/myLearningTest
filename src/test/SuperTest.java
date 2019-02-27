package test;

public class SuperTest {

	public static void main(String[] args) {
//		Student s = new Student("李四","1234");
		Student s = new Student();
		
		s.setUserName("张三");
		s.setPsw("123");
		System.out.println(s.getUserName()+"\n"+s.getPsw());
	}

}

class Manager{
	Manager(){
		System.out.println("我是父类");
	}
	Manager(String userName,String psw){
		this.userName = userName;
		this.psw = psw;
	}
	private String userName;
	private String psw;

	void setUserName(String userName){
		this.userName = userName;
	}
	void setPsw(String psw){
		this.psw = psw;
	}
	
	public String getUserName(){
		return this.userName;
	}
	public String getPsw(){
		return this.psw;
	}
}

class Student extends Manager{
	Student(){}
	Student(String usrName,String psw){
		super(usrName,psw);
	}
}