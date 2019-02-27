package io.io_Object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		PrintStream ps = new PrintStream("D:/1.txt");
//		ps.println(new Student("xiaoA",18));
//		ps.println(new Student("xiaoB",28));
//		ps.close();
		
		//д����
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/oo1.txt"));
//		oos.writeObject(new Student("xiaoA",18));
//		oos.writeObject(new Student("xiaoB",28));
//		oos.close();
		
		//�ع�����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/oo1.txt"));
		Object obj = ois.readObject();
		System.out.println(obj);
		System.out.println(obj.getClass());
		System.out.println(obj instanceof Student);
		Student s = (Student)obj;
		System.out.println(s.getName());
		ois.close();
	}

}
