package io.io_Reader_Writter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {

	/**
	 * FileWriter	�ַ����������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer w = new FileWriter("D:/111.txt");
		w.write("��ˬ");
		w.write("��ˬ");
//		w.flush();
		w.close();
	}

}
