package io.io_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest3 {

	/**
	 * ��ͳ�쳣����ṹ
	 * 		try{
	 * 			���ܳ����쳣�Ĵ���
	 * 		}catch(){
	 * 			�����쳣
	 * 		}finally{
	 * 			�ر����ͷ���...
	 * 		}
	 * -------------------------------
	 * Java7��һ���½ṹ������IO������ʱ���Զ��ر���
	 * 		try(
	 * 			����IO������Ĵ���
	 * 			ע�⣺���������IO��������֧���Զ��رյ�
	 * 			Java7֮ǰ�ܶ�IO�����඼��ʵ����Closeable�ӿڣ������йرգ�close������
	 * 			Java7��ʼ֧�ֺܶ�IO��������ʵ����һ���½ӿڹر�
	 * 		){
	 * 			���ܳ����쳣�Ĵ���
	 * 		}catch(){
	 * 			�����쳣
	 * 		}
	 * 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		fileCopy("D:/1.jpg","E:/1.jpg");

	}
	
	public static void fileCopy(String src,String dest){	
		try(
			InputStream if1 = new FileInputStream(src);
			OutputStream if2 = new FileOutputStream(dest);
		){
			byte[] b = new byte[10];
			int len;
			while((len = if1.read(b)) != -1){
				if2.write(b, 0, len);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		//��д��һ�߶�һ��д
		
		
		//�ر���Դ���������������ȿ��ĺ��
	}

}
