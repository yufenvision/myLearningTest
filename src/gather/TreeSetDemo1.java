package gather;

import java.util.TreeSet;

public class TreeSetDemo1 {
	
	
	/**
	 * ����TreeSet������
	 * �����ٴ���һ��TreeSet
	 * 	  ����������Ӽ���Ԫ��
	 */
	public static void main(String[] args) {
		//��ô�������TreeSet
		TreeSet ts = new TreeSet(new StudentComparator());
		StudentComparator comp = new StudentComparator();
		StudentTree1 st1 = new StudentTree1("�����", 500);
		StudentTree1 st2 = new StudentTree1("��˽�", 1200);
		StudentTree1 st3 = new StudentTree1("��˽�1", 1200);
		ts.add(st1);
		ts.add(st2); 
		ts.add(st3);
		/* Ҫ����Ҫ�Ƚϵ��඼ʵ��comparable�ӿ�
		 * ������compareTo����
		*/
		
		System.out.println(ts.size());
		System.out.println(ts);
		System.out.println(comp.compare(st1,st2));
		System.out.println(st1);

	}

}
