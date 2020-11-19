package java_collection.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	/**
	 * Map使用示例：有如下字符串，String str = "aaaabbbyyyccc";
	 * 需求：1）统计出str中每一个字符串的个数
	 * 		比如 a - 4
	 * 		   b - 3
	 * 	   2）找出并打印，次数最多的字符和次数[a - 4]
	 * 		分析：遍历Map,取出所有values,找出values中最大值4
	 * 			再根据max,找出key
	 */
	public static void main(String[] args) {
		
		String str = "aaaabbbyyyccc";
		Map<Character,Integer> m = new HashMap();
		//遍历字符串
		for (int i = 0; i < str.length(); i++) {
			//取出字符串里面的字符
			char c = str.charAt(i);
			//判断是否在Map里面
			if(m.containsKey(c)){
				//不是第一次，取出value,value +1
				Integer count = m.get(c);
				m.put(c, count+1);
			}else{
				m.put(c, 1);
			}
		}
		
		System.out.println(m);
		
		//方式一：找出最大的value
		Collection cl  = m.values();
		//遍历出value的最大值
		Integer max = 0;
		for (Object object : cl) {
			Integer i = (Integer)object;
			if(max < (Integer)i){
				max = i;
			}
		}
		
		System.out.println(max);
		
		//方式二：取最大值cl能否转换成数组，Arrays.sort(数组);
		Integer max1 = 0;
		Object[] objArr = cl.toArray();
		Arrays.sort(objArr);
		max1 = (Integer)objArr[objArr.length-1];
		
		System.out.println(max1);
		
		//方式三： Collections.max(cl)
		Integer max2 = (Integer)Collections.max(cl);
		
		System.out.println(max2);
		
		//根据max，找key
		Set keys = m.keySet();
		for (Object obj : keys) {
			if(m.get(obj).equals(max)){
				System.out.println("最大的key是"+obj+"-最大的value:"+max);
			}
		}
	}

}
