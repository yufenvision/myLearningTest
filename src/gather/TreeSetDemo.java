package gather;

import java.util.TreeSet;

public class TreeSetDemo {
	
	
	/**
	 * ����TreeSet������
	 * �����ٴ���һ��TreeSet
	 * 	  ����������Ӽ���Ԫ��
	 */
	public static void main(String[] args) {
		//��ô�������TreeSet
		TreeSet ts = new TreeSet();
		StudentTree st1 = new StudentTree("�����", 500);
		StudentTree st2 = new StudentTree("��˽�", 1200);
		StudentTree st3 = new StudentTree("��˽�1", 1200);
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		/* Ҫ����Ҫ�Ƚϵ��඼ʵ��comparable�ӿ�
		 * ������compareTo����
		*/
		
		System.out.println(ts.size());
		System.out.println(ts);
//		System.out.println(st2.compareTo(st2));
//		System.out.println(s.name);

	}

}
