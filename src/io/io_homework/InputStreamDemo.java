package io.io_homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�ֽ���
		InputStream is = new FileInputStream("D:/1.txt");
		read(is);
		OutputStream ot = new FileOutputStream("D:/1.txt",true);
		
		String ot_add = "��������";
		ot.write(ot_add.getBytes());
		ot.close();
		
		read(is);
	}
	
	public static void read(InputStream s) throws IOException{
		byte[] b = new byte[10];
		int len;
		while((len = s.read(b)) != -1){
			System.out.print(new String(b,0,len));
		}
		System.out.println();
	}
}
