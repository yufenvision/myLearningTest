package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassConstructorDemo1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		Class<A> c = A.class;
//		A a = c.newInstance();
//		System.out.println(a.getClass());
		
		/*
		 * ͨ�����Student�Ĺ�����������Student�Ķ���
		 * �� �ȵõ�Student��Classʵ��
		 * �� ͨ���ٵ���get...�����õ�Student�е�ָ���Ĺ��췽��
		 * �� ͨ���õ����췽��������Student����
		 * 		Constructor�еķ�����	T newInstance(Object...initargs)
		 * 
		 * */
		Class<Student> c = Student.class;
		Constructor<Student> con = c.getDeclaredConstructor(String.class,int.class);
		con.setAccessible(true);
		Student s = con.newInstance("С��",19);
		System.out.println(s);
		
	}

}
