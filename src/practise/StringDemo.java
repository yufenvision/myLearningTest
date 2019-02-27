package practise;

public class StringDemo {

	public static void main(String[] args) {
		/* 创建一个String对象
			1）通过new String（）构造方法创建对象
			
		*/
		String str = new String();
		String str1 = "";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str == str1);
		System.out.println(str.equals(str1));		
		System.out.println("--------------------");
		
		String s1 = "快速减肥";
		String s2 = "快速减肥";
		System.out.println(s1 == s2);//这里为true是因为s1,s2都指向的是“常量池”，没有指向堆内存
		System.out.println(s1.equals(s2));
		
		String s11 = new String("快速增肥");
		String s12 = new String("快速增肥");
		System.out.println(s11 ==  s12);
		System.out.println(s11.equals(s12));
	}

}
