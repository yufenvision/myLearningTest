package io.io_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest2 {

	/**
	 * �ļ������ķ���
	 * 		����������Դ�ļ���Ŀ���ļ�
	 * ���Ĵ��룺�� д
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		fileCopy("D:/1.jpg","E:/1.jpg");

	}
	
	public static void fileCopy(String src,String dest){	
		InputStream if1 = null;
		OutputStream if2 = null;
		try {
			if1 = new FileInputStream(src);
			if2 = new FileOutputStream(dest);
			//��д��һ�߶�һ��д
			byte[] b = new byte[10];
			int len;
			while((len = if1.read(b)) != -1){
				if2.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			//Ӧ�����ж����Ƿ�Ϊnull
			//�ر���Դ���������������ȿ��ĺ��
			try {
				if2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
	
		
		
