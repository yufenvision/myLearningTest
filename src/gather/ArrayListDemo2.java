package gather;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	/**
	 * �򵥴�ż�������
	 */
	public static void main(String[] args) {
		ArrayList ages = new ArrayList();
		
		ages.add(18);
		ages.add(19);
		ages.add(20);
		ages.add(24);
		ages.add(29);
		//������һ��������
		System.out.println("�Ƴ�ǰages:"+ages);
		Iterator it = ages.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		//�ǲ������Ϳ�����Ϊ�ж�����
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		while(it.hasNext()){
			//System.out.println(it.next());
			//�ж�it.next���ֵ��19��ʱ���ٵ���remove
			Object obj = it.next();
			if(obj.equals(19)){
				//����remove()����
				it.remove();
			}
		}
		//��ӡages�Ƿ��Ѿ��Ƴ���19
		System.out.println("�Ƴ����ages:"+ages);
		
	}

}
