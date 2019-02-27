package io.io_practise;

import java.io.File;
import java.io.IOException;

public class FilenameFilterDemo1 {

	/**
	 * File�о��й���Ч����List������ʹ��
	 * 	String[] list(FilenameFilter filter)
	 * 	1)�˷�����Ҫһ��File����
	 * 	2)�˷�������������Ļ�Ӧ����һ��Ŀ¼�������
	 * 	3)���ô˷�����Ҫ����һ���ļ���������
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("H:/Դ���������/��Ƶ/day24");
		String[] s = f.list(new TxtFilenameFilter());
		
		File f_new = new File("H:/Դ���������/��Ƶ/day24/avi��Ƶ�ļ���");
		f_new.mkdirs();
		for (String string : s) {
//			System.out.println(string);
//			�ڴ������ļ����з����ļ�
			File str = new File(f_new+"/"+string);
			str.createNewFile();
		}
		
		//�ٰ�����ļ�ɾ����
		FileDemo1.deleteAll(f_new);
	}

}
