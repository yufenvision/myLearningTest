package myPractise.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;


public class ThreadSafeClass {
	public static <T> void main(String[] args) {
		//线程安全的类 
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<>();
		Hashtable<String,String> h = new Hashtable<>();
		
		//vector是线程安全的时候才去考虑使用的，但是我还说过即使要安全，我也不用你
		//那么到底用谁呢？
		List<String> list1 = new ArrayList<>();//线程不安全
		List<T> lis2 = Collections.synchronizedList(new ArrayList<>());//线程安全的
	}
}
