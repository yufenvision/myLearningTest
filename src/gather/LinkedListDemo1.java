package gather;

import java.util.LinkedList;

public class LinkedListDemo1 {

	/**
	 * 创建一个LinkedList
	 */
	public static void main(String[] args) {
		// 创建一个LinkedList对象
		LinkedList lol = new LinkedList();
		//添加数据add(Object obj)
		lol.add("盖伦");
		lol.add("段位");
		lol.add("青龙");
		
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
//		//先进先出
//		System.out.println(lol.pop());
//		System.out.println(lol.pop());
//		System.out.println(lol.size());
//		System.out.println(lol);
		
	}

}
