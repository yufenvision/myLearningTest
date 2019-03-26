package polymorphic.implyourinterface;

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
		
		//需要创建MEA-INF文件夹，里面放接口的全限定名文件，再在该文件中写入实现类的全限定名
		ServiceLoader<MyDefinedInterface> loader = ServiceLoader.load(MyDefinedInterface.class);
		for (MyDefinedInterface myDefinedInterface : loader) {
			System.out.println(myDefinedInterface);
		}
		
	}
}
