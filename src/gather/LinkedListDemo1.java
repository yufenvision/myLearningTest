package gather;

import java.util.LinkedList;

public class LinkedListDemo1 {

	/**
	 * ����һ��LinkedList
	 */
	public static void main(String[] args) {
		// ����һ��LinkedList����
		LinkedList lol = new LinkedList();
		//�������add(Object obj)
		lol.add("����");
		lol.add("��λ");
		lol.add("����");
		
		int size = lol.size();
		for (int i = 0; i < size; i++) {
			lol.pop();
		}
		System.out.println(lol);
		System.out.println(size);
		
//		lol.addFirst("<");
//		System.out.println(lol.peek());
//		System.out.println(lol.poll());
//		System.out.println(lol.element());
//		
//		//�Ƚ��ȳ�
//		System.out.println(lol.pop());
//		System.out.println(lol.pop());
//		System.out.println(lol.size());
//		System.out.println(lol);
		
	}

}
