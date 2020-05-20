package collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		//讲所有指定元素添加到指定Collection中
		
		List list = new ArrayList();
		Collections.addAll(list, "谭老二","小赵赵","测试","true",false);
		System.out.println(list);
		
		//将所有元素从一个列表复制到另一个列表
		List list1 = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			list1.add(i);
		}
		
		Collections.copy(list1,list); 
		System.out.println(list1);
		Collections.shuffle(list1);//随机摆放
		System.out.println(list1);
	}
}
