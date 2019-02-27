package gather;

import java.util.HashSet;

/**
 * HashSet不能添加重复元素
 *
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		String str = "123";
		
		hs.add(i1);
		hs.add(i2);
		hs.add(str);
		
		System.out.println(hs.size());
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(str.hashCode());
	}
	
	
}
