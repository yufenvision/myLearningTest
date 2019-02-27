package myPractise.javaBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StrReverse {
	
	public static String reverse(String originStr){
		if(originStr ==null || originStr.length()<=1){
			return originStr;
		}
		return reverse(originStr.substring(1))+originStr.charAt(0);
	}

	public static void test(Integer...arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverse("123456"));
		//test(1,23,44);
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()){
//			String temp = iter.next();
//			if("2".equals(temp)){
//				iter.remove();
//			}
//		}
//		for (int i = 0; i < list.size(); i++) {
//			if("2".equals(list.get(i))){
//				list.remove(i);
//			}
//		}
		for (String string : list) {
			if("2".equals(string)){
				list.remove(string);
			}
		}
		System.out.println(list);
	}
	
	
}
