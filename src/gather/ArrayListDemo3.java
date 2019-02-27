package gather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {

	/**
	 * 双向迭代器
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ages = new ArrayList();
		
		//添加几个年龄到容器里面
		ages.add(18);
		ages.add(19);
		ages.add(20);
		ages.add(21);
		ages.add(22);
		//创建一个迭代器
		Iterator it = ages.iterator();
		//单向迭代器
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//没有输出结果
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//创建一个双向的迭代器
		ListIterator lit = ages.listIterator();
		//正向遍历
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		System.out.println("------------- ");
		//反向遍历
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
		
	}

}
