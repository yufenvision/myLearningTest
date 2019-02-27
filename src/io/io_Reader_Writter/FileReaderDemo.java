package io.io_Reader_Writter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {

	/**
	 * �ַ���-��������ȡ�ļ�
	 * 		���Զ�ȡһ����һ���ַ�
	 * FileReader
	 * ���췽����
	 * 		FileReader(File file)�ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader�� 
			FileReader(String fileName)�ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader�� 

	 * ��ȡ������
	 * 		 int read()��ȡ�����ַ��� 
 			 int read(char[] cbuf)���ַ��������顣
 			 int read(char[] cbuf, int off, int len)���ַ����������ĳһ���֡� 
	 * @throws IOException 

	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader r = new FileReader("D:/1.txt");
//		System.out.println((char)r.read());
//		System.out.println((char)r.read());
//		System.out.println((char)r.read());
		char[] cbuf = new char[10];
		int len;
		while((len = r.read(cbuf)) != -1){
			System.out.print(new String(cbuf,0,len));
		}
		r.close();
	}

}
