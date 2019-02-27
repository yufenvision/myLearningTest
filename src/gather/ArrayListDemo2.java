package gather;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	/**
	 * 简单存放几个数字
	 */
	public static void main(String[] args) {
		ArrayList ages = new ArrayList();
		
		ages.add(18);
		ages.add(19);
		ages.add(20);
		ages.add(24);
		ages.add(29);
		//创建了一个迭代器
		System.out.println("移除前ages:"+ages);
		Iterator it = ages.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		//是布尔类型可以作为判断条件
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		while(it.hasNext()){
			//System.out.println(it.next());
			//判断it.next输出值是19的时候，再调用remove
			Object obj = it.next();
			if(obj.equals(19)){
				//调用remove()方法
				it.remove();
			}
		}
		//打印ages是否已经移除掉19
		System.out.println("移除后的ages:"+ages);
		
	}

}
