package gather;

import java.util.HashSet;

/**
 * HashSet��������ظ�Ԫ��
 *	
 */
public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Student s1 = new Student("����",18);
		Student s2 = new Student("����",18);
		Student s3 = new Student("����",22);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//������ʾһ����Ӧ�ø�дhashCode����equals����
		//������ӡ[���� - 18]��дtoString
		System.out.println(hs);
		System.out.println(hs.size());
	}
	
	
}
