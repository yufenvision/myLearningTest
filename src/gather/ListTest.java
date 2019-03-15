package gather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(){{
			add("你好啊");
			add("哈哈哈");
			add("123");
			add("444");
			add("xxx.jpg");
			add("xxx.png");
		}};
		
		List<String> list2 = new ArrayList<String>(){{
			add("你好");
			add("哈哈哈");
			add("123");
			add("444");
			add("xxx.jpg");
			add("fff.jpg");
		}};
		
		List<String> list1Temp = new ArrayList<>();
		list1Temp.addAll(list1);
		list1.removeAll(list2);
		list2.removeAll(list1Temp);
		System.out.println(list1);
		System.out.println(list1Temp);
		System.out.println(list2);
	}
}
