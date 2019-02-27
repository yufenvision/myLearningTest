package practise;

public class StringTest {

	public static void main(String[] args) {
		// 测试String字符串的拼接
		String str = new String("AA");
		change(str);
		System.out.println(str);
		
		Atest a = new Atest();
		System.out.println(a.getName());
		
	}
	public static void change(String s){
		s = s + "BB";
	}

}

class Atest{
	private String name = "我是A";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}