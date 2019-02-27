package lambda;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月30日 下午11:14:19
* 类说明
*/
public class Person {
	private String firstName, lastName, job, gender;
	private int salary, age;
	public Person(String firstName, String lastName, String job, String gender, int age, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", job=" + job + ", gender=" + gender
				+ ", salary=" + salary + ", age=" + age + "]";
	}
}
