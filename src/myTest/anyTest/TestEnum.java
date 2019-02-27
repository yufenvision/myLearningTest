package myTest.anyTest;

public class TestEnum {
	private String msg="真男人";
	
	public static void main(String[] args) {
		TestEnum testEnum = new TestEnum();
		System.out.println(testEnum.msg);
		System.out.println(TestEnum.Status.MAN.hashCode());
		TestEnum.Status.MAN.setValue("变性了");//因为MAN想当于一个final的对象，他的属性可以变，但是地址值是没变的
		System.out.println(TestEnum.Status.MAN.hashCode());
		System.out.println(TestEnum.Status.MAN.value);
		
		testEnum.setStatus(TestEnum.Status.MAN);
		System.out.println(testEnum.msg);
	}
	
	public enum Status{
		MAN("男人"),
		WOMAN("女人");
		
		String value;
		Status(String value){
			this.value = value;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	}
	public void setStatus(Status status){
		this.msg = status.value;
	}
	
	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	/*
	 * 以final修饰的方法可以被重载，不能被覆写
	 */
	public final void overLoad(){
		
	}
	public final void overLoad(String name){
		System.out.println(name);
	}
	
	public final void override(){
		
	}
}
