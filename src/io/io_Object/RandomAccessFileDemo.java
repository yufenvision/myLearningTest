package io.io_Object;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile r = new RandomAccessFile("D:/1111.txt","rw");
		//����д-��ͨ��
		//�������ʱ��û�������ļ�ָ�룬���ͷ��ʼд���ݣ�֮ǰ�е����ݻᱻ����
//		r.write("qwer".getBytes());
		//�����ļ������׷�����ݣ�д֮ǰ���ļ�ָ������Ϊ�ļ�ĩβ(ÿ������֮ǰ��Ĭ��ָ�����ļ���ͷ)
//		r.seek(r.length());
//		r.write("hehe".getBytes());
//		r.close();
		
		//��ȡ
//		r.seek(3);
//		System.out.println((char) r.read());
//		r.setLength(1024*1024*1024);...new RandomAccessFile("D:/��������.avi","rw");����һ����������avi�ļ�������д�벻�������ļ���С����Ϊ�Ǹ���֮ǰ����
		r.close();
	}

}
