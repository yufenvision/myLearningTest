package myPractise.url;

import java.io.File;
import java.net.URL;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class URL_URI_test {
	static Class<URL_URI_test> CLZ = URL_URI_test.class;

	public static void main(String[] args) {

		URL u1 = CLZ.getResource("");//得到当前类文件的URL目录,不包括自己
		System.out.println(u1);
		
		URL u2 = CLZ.getResource("/");//得到当前的classpath的绝对URI路径
		System.out.println(u2);

		URL u3 = Thread.currentThread().getContextClassLoader().getResource("");//得到的也是当前classpath的绝对URI路径,推荐使用
		System.out.println(u3);

		String u4 = System.getProperty("user.dir");//获取当前工程src目录下路径
		System.out.println(u4);
		
		File file = new File(u3.getFile());
		String[] classNames = file.list();
		System.out.println(Stream.of(classNames).collect(Collectors.toList()));
	}
	
}
