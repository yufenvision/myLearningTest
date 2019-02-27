package reflect;

import java.util.List;
import java.util.ArrayList;

public class ClassDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//类 - 获得Class的对象 String为例
		Class c1 = Class.forName("java.lang.String");//应该是类的完全限定名
		Class c2 = String.class;
		Class c3 = "aa".getClass();
		//上面三种方法得到的都是String类对应的Class实例
		//一个类型只会存在一份字节码对象（Class实例），所以上面3个使用 == 比较的结果true
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		System.out.println(c1);
		
		//接口 - 获得Class 的对象 List
		List list = new ArrayList();
		Class c11 = Class.forName("java.util.List");
		Class c22 = List.class;
		Class c33 = list.getClass(); // 得到是ArrayList，获得的是运行时类型
		
		System.out.println(c11 == c22);
		System.out.println(c11 == c33);
		
		//数组 - 获得Class实例的方式;
		int[] a = new int[10];
		int[] b = new int[1000];
		int[][] ab = new int[2][3];
		
		Class ci1 = int[].class;
		Class ci2 = a.getClass();
		Class ci3 = b.getClass();
		Class ci4 = ab.getClass();
		
		System.out.println(ci1 == ci2);
		System.out.println(ci2 == ci3);
		System.out.println(ci3 == ci4);
		
		//基本数据类型 - 获得Class实例的方式 int
		Class i1 = int.class;
		Class i2 = Integer.TYPE;
		Class i3 = Integer.class;
		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
		
		//特殊的void和上面的int一样
		Class v1 = void.class;
		Class v2 = Void.TYPE;
		System.out.println(v1 == v2);
		
		
		
	}

}
