package io.io_Reader_Writter;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner("��1ʹ�� ˫�ع�2����3����,����-��4  ��ʹ�û�-�ܹ���System.in�ж�88ȡһ��9��");
		s.useDelimiter("[0-9]");//��������ֶ��Ƿָ���
		
		System.out.println(s.next());
		System.out.println(s.next());
		
		s.close();
	}

}
