package gather;

import java.util.Comparator;

/**
 * �൱�ڲ�����
 * ʵ��Comparator�ӿ�
 * ��дcompare����
 */
public class StudentComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		StudentTree1 s1= (StudentTree1)o1;
		StudentTree1 s2= (StudentTree1)o2;
		
		if(s1.age == s2.age){
			return 0;
		}else if(s1.age > s2.age){
			return 1;
		}else{
			return -1;
		}
		
	}
	
}
