package io.io_Reader_Writter;

import java.io.UnsupportedEncodingException;

public class CharsetDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// ����String ---> byte[]
		String s1 = "��Һ�";
//		byte[]b = s1.getBytes();
		byte[] b = s1.getBytes("UTF-8");
		
		//����byte[] ---> String
		String s2 = new String(b,"UTF-8");
		System.out.println(s2);
	}

}
