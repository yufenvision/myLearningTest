package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassConstructorDemo1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		Class<A> c = A.class;
//		A a = c.newInstance();
//		System.out.println(a.getClass());
		
		/*
		 * 通过获得Student的构造器来创建Student的对象
		 * ① 先得到Student的Class实例
		 * ② 通过①调用get...方法得到Student中的指定的构造方法
		 * ③ 通过得到构造方法来创建Student对象
		 * 		Constructor中的方法：	T newInstance(Object...initargs)
		 * 
		 * */
		Class<Student> c = Student.class;
		Constructor<Student> con = c.getDeclaredConstructor(String.class,int.class);
		con.setAccessible(true);
		Student s = con.newInstance("小米",19);
		System.out.println(s);
		
	}

}
