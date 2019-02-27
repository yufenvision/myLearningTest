package polymorphic;
/**
* @author 作者 dyf:
* @version 创建时间：2019年1月19日 下午8:52:29
* 类说明
*/
public class MainTest {
	public static void main(String[] args) {
		
		NewInterface face = new NewInterface() {
			
			@Override
			public void saySomething(String words) {
				System.out.println("匿名实现类说：" + words);
			}
		};
		
		face.saySomething("哈哈");
		
		
//		AbstractClass abs = new AbstractClass();//编译不通过，抽象类不能被new出来
		
		Person p = new Man();
		p.sleep(5);
	}
}
