package myTest.compare2List;

public class Person {
	
	private String id;
	
	private String name;
	
	private String phone;
	
	public Person() {
		super();
	}

	public Person(String id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Person){
			Person p = (Person)o;
			return this.id.equals(p.getId()) 
				&& this.name.equals(p.getName())
				&& this.phone.equals(p.getPhone());
		}
		
		return false;
	}
	
}
