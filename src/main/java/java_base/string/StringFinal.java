package java_base.string;

import java.util.Arrays;

public class StringFinal {
	
	
	//String是在代码中非常常见的一种数据类型.它能直接像基本类型一样直接赋值(String str = "test"),也能像引用类型一样创建一个实例(String str = new String("test")),当然毫无疑问String是引用类型.
	public static void main(String[] args) {
		String a = "Hello2";//此种方式会在字符串常量池中创建一个"Hello2'"常量,当有一个新的变量同样也赋值为"Hello2"时,这个新的变量也指向了这个"Hello2"常量.
		String aa = "Hello" + 2;//只有使用引号包含文本的方式创建的String对象之间使用"+"连接产生的新对象才会被加入到字符串池中。
		final String b = "Hello";
		String a1 = "Hello";
		String c = getHello();
		String d = b+2;
		String e = a1+2;
		String f = c+2;

		System.out.println(a==d);//true
		System.out.println(a==aa);//两个都是字符串池中创建的
		System.out.println(a==e);//false
		System.out.println(a==f);//false
		System.out.println(a.equals(e));//true

		int i =0;
		int n = 5;
		int[] arr = new int[n];
		while(n-- !=0){
			System.out.println(n);
			arr[i]=i;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static String getHello() {
		return "Hello";
	}
}
