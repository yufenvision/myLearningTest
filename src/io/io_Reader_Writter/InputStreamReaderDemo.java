package io.io_Reader_Writter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		//�ֽ���ת�ַ���
		InputStream is = new FileInputStream("D:/111.txt");
		test(is);
		
		//�ַ���ת�ֽ���
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/333.txt"));
		osw.write("���Ϻ�ţ��");
		osw.close();
		
	}
	public static void test(InputStream is) throws IOException{
		//�˷����ڲ���Ҫ��ɵĹ�����Ҫ�ǲ����ַ�����ʹ���ַ���
		InputStreamReader isr = new InputStreamReader(is);
		char[] cbuf = new char[10];
		int len;
		while((len = isr.read(cbuf)) !=-1){
			System.out.print(new String(cbuf,0,len));
		}
		isr.close();
	}
}
