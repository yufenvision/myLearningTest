package myTest.extend;

import java.util.List;

public class Father<T> {

	private String name;
	
	private Integer age;

	private List<T> records;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<T> getRecords() {
		return records;
	}

	public Father<T> setRecords(List<T> records) {
		this.records = records;
		return this;
	}

	@Override
	public String toString() {
		return "Father [name=" + name + ", age=" + age + ", records=" + records + "]";
	}
	
	
}
