package myPractise.gather;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//如何给一个list集合去重
public class ListDistinct {
	
	private static List<Integer> list1 = new ArrayList<>();

	public static void main(String[] args) {
		//List<Integer> list1 = new ArrayList<>();
//		int[] arr = {1,4,3,3,11,23,5,1,9,5,4,7};
//		list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int i = 1000;
		while(i-- !=0){
			Integer num = (int) (Math.floor(Math.random()*100+1));
			list1.add(num);
		}
		System.out.println(list1);
		System.out.println("结果为："+distinct_1(list1));
		System.out.println("结果为:"+distinct_2(list1));
		System.out.println("结果为:"+distinct_3(list1));
	}
	
	//通过两个for循环和equals方法去重
	public static List<Integer> distinct_1(List<Integer> list1){
		System.out.println(list1.size());
		List<Integer> result = new ArrayList<>();
		for (Integer integer : list1) {
			result.add(integer);
//			result.add(new Integer(integer.intValue()));
		}
		Long start = System.currentTimeMillis();
		for (int i = 0; i < result.size(); i++) {
//			for (int j = 0; j < result.size(); j++) {
//				if(result.get(i).equals(result.get(j))){
//					result.remove(j);//有问题的代码
//				}
//			}
			for (int j = result.size()-1; j > i; j--) {
				if(result.get(i).equals(result.get(j))){
					result.remove(j);
				}
			}
		}
		Long end = System.currentTimeMillis();
		System.out.println("消耗"+(end-start)+"毫秒");
		return result;
	}
	
	//通过contains方法去重
	public static List<Integer> distinct_2(List<Integer> list1){
		System.out.println(list1.size());
		Long start = System.currentTimeMillis();
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			if(!result.contains(list1.get(i))){
				result.add(list1.get(i));
			}
		}
		Long end = System.currentTimeMillis();
		System.out.println("消耗"+(end-start)+"毫秒");
		return result;
	}
	
	//通过hashset去重
	public static List<Integer> distinct_3(List<Integer> list1){
		System.out.println(list1.size());
		Long start = System.currentTimeMillis();
		List<Integer> result = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (Integer integer : list1) {
			if(set.add(integer)){
				result.add(integer);
			}
		}
		Long end = System.currentTimeMillis();
		System.out.println("消耗"+(end-start)+"毫秒");
		return result;
	}
}
