package io.io_Reader_Writter;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class SystemDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		PrintStream ps = System.out;
//		ps.println(123);
//		System.err.println("err");
		
//		������
//		InputStream is = System.in;
//		System.out.println((char)is.read());
		
//		�ض���
		System.setOut(new PrintStream("D:/print.txt"));
		System.out.println("asfsad");
		System.out.println(123);
		System.out.println(123);
		System.out.println(123);
		
	}

}
