package myTest.anyTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintfTest {
	public static void main(String[] args) {
		
		String s = "我是字符串";
		int i = 16;
		System.out.printf("%s:%n\t%d",s,i);
		
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String time = d.format(new Date("154155680800"));
		System.out.println(System.currentTimeMillis());
		
	}
}