package gather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {

	/**
	 * ˫�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ages = new ArrayList();
		
		//��Ӽ������䵽��������
		ages.add(18);
		ages.add(19);
		ages.add(20);
		ages.add(21);
		ages.add(22);
		//����һ��������
		Iterator it = ages.iterator();
		//���������
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//û��������
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//����һ��˫��ĵ�����
		ListIterator lit = ages.listIterator();
		//�������
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		System.out.println("------------- ");
		//�������
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
		
	}

}
