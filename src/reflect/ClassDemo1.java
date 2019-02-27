package reflect;

import java.util.List;
import java.util.ArrayList;

public class ClassDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//�� - ���Class�Ķ��� StringΪ��
		Class c1 = Class.forName("java.lang.String");//Ӧ���������ȫ�޶���
		Class c2 = String.class;
		Class c3 = "aa".getClass();
		//�������ַ����õ��Ķ���String���Ӧ��Classʵ��
		//һ������ֻ�����һ���ֽ������Classʵ��������������3��ʹ�� == �ȽϵĽ��true
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		System.out.println(c1);
		
		//�ӿ� - ���Class �Ķ��� List
		List list = new ArrayList();
		Class c11 = Class.forName("java.util.List");
		Class c22 = List.class;
		Class c33 = list.getClass(); // �õ���ArrayList����õ�������ʱ����
		
		System.out.println(c11 == c22);
		System.out.println(c11 == c33);
		
		//���� - ���Classʵ���ķ�ʽ;
		int[] a = new int[10];
		int[] b = new int[1000];
		int[][] ab = new int[2][3];
		
		Class ci1 = int[].class;
		Class ci2 = a.getClass();
		Class ci3 = b.getClass();
		Class ci4 = ab.getClass();
		
		System.out.println(ci1 == ci2);
		System.out.println(ci2 == ci3);
		System.out.println(ci3 == ci4);
		
		//������������ - ���Classʵ���ķ�ʽ int
		Class i1 = int.class;
		Class i2 = Integer.TYPE;
		Class i3 = Integer.class;
		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
		
		//�����void�������intһ��
		Class v1 = void.class;
		Class v2 = Void.TYPE;
		System.out.println(v1 == v2);
		
		
		
	}

}
