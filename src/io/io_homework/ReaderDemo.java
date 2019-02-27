package io.io_homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		// �ַ���
		Reader r = new FileReader("D:/111.txt");
		readMe(r);
		Writer w = new FileWriter("D:/111.txt");
		String msg = "����������";
		w.write(msg);
		w.close();
		readMe(r);
	}
	public static void readMe(Reader r) throws IOException{
		char[] b = new char[5];
		int len;
		while((len = r.read(b)) != -1){
			System.out.println(new String(b,0,len));
		}
	}
}
