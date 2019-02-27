package myPractise.getXmlOrProperties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

/**
 * 获取properties文件方式
 *
 */
public class GetProperties {
	
	public static void main(String[] args) throws IOException {
		System.out.println(GetProperties.class.getResource("/"));
		Properties p = new Properties();
		//第一种方法-相对路径获取
		InputStream in =GetProperties.class.getResourceAsStream("content.properties");
		//p.load(in);
		
		//第二种方法-绝对路径获取
		//InputStream in = new FileInputStream("E:/eclipse_jdk1.8/workspace/myPractise/baseClass/getXmlOrProperties/content.properties");
		//字节转字符流，中文不乱码
		InputStreamReader Reader = new InputStreamReader(in);
		//缓冲流
		//BufferedReader bufferReader = new BufferedReader(new FileReader("E:/eclipse_jdk1.8/workspace/myPractise/baseClass/getXmlOrProperties/content.properties"));
		p.load(Reader);
		Reader.close();
		in.close();
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		//testPrintStream();
	}
	
	
	//测试下文档扫描器和打印流
	public static void testPrintStream() throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
		
		PrintStream ps = new PrintStream("E:/eclipse_jdk1.8/workspace/myPractise/baseClass/getXmlOrProperties/test.txt");
		for (int i = 1; i <= 5; i++) {
			ps.println("写讯息了:第"+i+"条");
		}
		ps.print(sc.nextLine());
		sc.close();
		ps.close();
	}
	
	
}
