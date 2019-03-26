package thinkingInJava.chapter2;

import java.util.Date;
import java.util.Properties;

/**
* @author 作者 dyf:
* @version 创建时间：2019年3月26日 上午11:17:33
*/
public class Porperty {
	public static void main(String[] args) {
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("--- Memory Usage:");
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total Memory = "
				+ rt.totalMemory()
				+ " Free Memory = "
				+ rt.freeMemory());
		
	}
}
