package myPractise.url;

import java.io.File;
import java.net.URL;

public class URL_URI_test {
	static Class<URL_URI_test> clz = URL_URI_test.class;
	
	
	public static void main(String[] args) {
		
		
		
		URL u1 = clz.getResource("");//得到当前类文件的URL目录,不包括自己
		System.out.println(u1);
		
		URL u2 = clz.getResource("/");//得到当前的classpath的绝对URI路径
		System.out.println(u2);
		URL u4 = Thread.currentThread().getContextClassLoader().getResource("");//得到的也是当前classpath的绝对URI路径
		System.out.println(u4);
		URL u3 = Thread.currentThread().getContextClassLoader().getResource("url");//得到也是当前的classpath的绝对URI路径
		System.out.println(u3);
		
		File file = new File(u3.getFile());
		String[] classNames = file.list();
		for (String string : classNames) {
			System.out.println(string);
		}
	}
	
}
