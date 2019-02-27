package io.io_Reader_Writter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	/**
	 * Ŀ�ģ�ʹ��FileInputStream����ȡһ���ļ�������
	 * 	   ���췽����
	 * 		   FileInputStream(File file)��ʾfileָ����ļ��ж�ȡ�� 
			   FileInputStream(String name)name��ʾ�ļ���·������·����+�ļ�����
		 ��ȡ�ķ�����
		 	   int read()
		 	   		����һ�ζ���һ�������ֽڣ�����intֵ���Ƕ���������
		 	   int read(byte[] b)
		 	   		����һ�α�������ʾ���Զ�ȡ�������
		 	   		���������ݱ����ڴ����byte����b��
		 	   		���ص��Ǳ��ε��÷��������������ֽڸ���
		 	   		˼����b�������г��ȵģ�Ϊʲô��Ҫ�������ض����ĸ�����
		 	   int read(byte[] b,int off, int len)
		 	   		�������������ƣ�����ָ����b����ʲôλ�ÿ�ʼװ
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:/1.txt");
		//�� ��ȡһ�������ֽ�
//		System.out.println(fis.read()); //49
//		System.out.println((char)fis.read()); //2
//		System.out.println((char)fis.read()); //3
//		System.out.println((char)fis.read()); //4
		
		//��ʹ������ķ�ʽ��һ���ļ��е��������ݶ���ȡ���� -- whileѭ����֪������
//		int i;
//		while((i=fis.read()) != -1){
//			System.out.print((char)i+",");
//		}
		
		//һ�ζ���� ����int read(byte[] b)
		byte[] b  = new byte[5];
		int len;
		while((len = fis.read(b)) != -1){
			System.out.println(new String(b,0,len));
		}
		
	}

}
