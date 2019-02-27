package gather;

import java.util.ArrayList;

public class ArrayListDemo1 {
	/**
	 * 	需求：使用一个集合，比如ArrayList用来存储各位的年龄，计算出平均年龄;
	 *  分析：1）创建一个ArrayList
	 *  	2)往里面添加年龄
	 *  	3）遍历ArrayList，取出年龄，再累加sum
	 *  	4）sum/size
	 */
	public static void main(String[] args) {
		ArrayList ages = new ArrayList();
		int sum = 0;
		ages.add(18);
		ages.add(19);
		ages.add(20);
		ages.add(21);
		ages.add(22);
		
//		for(int i = 0; i < ages.size(); i++){
//			sum += (Integer)ages.get(i);
//		}
		//使用增强的for循环(源中的元素类型e：源 )
		for(Object i: ages){
			sum +=(Integer)i;
		}
		System.out.println(sum/ages.size());
	}
}
