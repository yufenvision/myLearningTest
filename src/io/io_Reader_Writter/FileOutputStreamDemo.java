package io.io_Reader_Writter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	/**
	 * Ŀ�ģ�����ͨ�����������д��һ���ļ���
	 * 		FileOutputStream
	 * 		���췽����
	 * 			FileOutputStream(File file)
	 * 			FileOutputStream(String name)
	 * 			������������췽�������������Ƿ����ļ���׷������
	 * 			FileOutputStream(File file, boolean append)����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
	 * 			FileOutputStream(String name, boolean append) ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ�����
	 * 		������
	 * 			 void write(byte[] b)	����һ��д��һ�������ֽ�
 				 void write(byte[] b, int off, int len) ����һ�Σ����԰�һ��byte����������д��
 				 void write(int b)����һ��,��b�����е�һ��������д��
 			ע�⣺FileOutputStream���Զ�����һ���ļ�������ļ����棬�����ļ�·�����ڵģ�
	 * @throws IOException 

	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("D:/1.txt",true);
		String msg = "�����������!";
		//��String --->byte[]	String���ж�Ӧ�ķ���
		os.write(msg.getBytes("UTF-8"));
		os.close();
	}

}
