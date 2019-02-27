package io.io_practise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileList {

	/**
	 * 	static File[] listRoots()�г����õ��ļ�ϵͳ���̷�
	 * 
	 *  String[] list() ���ص�ǰ���ļ��ж�������һ��������ļ����ļ��У�������
	 *  File[] listFiles()���ص�ǰ���ļ��ж�������һ��������ļ����ļ��У�(File�������ʽ)
	 *  
	 *  
	 */
	public static void main(String[] args) {
//		File[] fs = File.listRoots();
//		File f = new File("D:\\a");
//		String[] fs = f.list();
//		for (String s : fs) {
//			System.out.println(s);
//		}
		
//		File f = new File("D:\\a");
//		File[] fs = f.listFiles();
//		for (File s : fs) {
//			System.out.println(s);
//		}

		/*
		 * ���һ�������� �ܹ�����ָ��Ŀ¼���棬ָ�������ļ�������
		 *    ������Ŀ¼·��	ָ��������
		 *    ���أ������������ļ�����String����
		 *    ������
		 *    	��	�õ����е� --->	list
		 *    	��	�������еģ������������ĵ���������
		 *    	��	����...
		 */
		File avi = new File("H:\\Դ���������\\��Ƶ\\day23");
		String[] strArr = list(avi, ".avi");
		for (String s : strArr) {
			System.out.println(s);
		}
		
	}
	
	public static String[] list(File f,String suffix){
		//.....ʡ�ԶԲ������ж�....
		//׼��һ���������洢����������	���飿���ϣ�
		List<String> value = new ArrayList<String>();
		
		//�õ�����
		String[] str = f.list();
		//����str �����������ı�������
		for (String s : str) {
			if(s.endsWith(suffix)){
				value.add(s);
			}
		}
		//����
		return value.toArray(new String[value.size()]);  
	}

}
