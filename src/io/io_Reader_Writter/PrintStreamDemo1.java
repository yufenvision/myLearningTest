package io.io_Reader_Writter;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo1 {

	public static void main(String[] args) throws FileNotFoundException {
		// 字符打印流
		PrintStream ps = new PrintStream("D:/333.txt");
		
		ps.println(123);
		ps.println("这是字符打印流");
		ps.println(true);
		ps.println(new Object());
		ps.println('a'); 
		
		
		ps.close();
	}

}
