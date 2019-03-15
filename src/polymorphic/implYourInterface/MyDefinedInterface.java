package polymorphic.implYourInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

public interface MyDefinedInterface {
	String name = "我定义的接口，大家来实现";
	
	String getDataByYouGuys(String some);
	
	
	public static void main(String[] args) {
		
//		Class<MyDefinedInterface> clz = MyDefinedInterface.class;
//		try {
//			Constructor<MyDefinedInterface> constructor = clz.getDeclaredConstructor();
//			Map<String,MyDefinedInterface> map = new HashMap<>();
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ServiceLoader<MyDefinedInterface> loader = ServiceLoader.load(MyDefinedInterface.class);
		for (MyDefinedInterface myDefinedInterface : loader) {
			System.out.println(myDefinedInterface);
		}
		
	}
}
