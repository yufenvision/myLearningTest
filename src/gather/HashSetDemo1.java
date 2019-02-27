package gather;

import java.util.HashSet;

/**
 * HashSet不能添加重复元素
 *	
 */
public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Student s1 = new Student("良辰",18);
		Student s2 = new Student("良辰",18);
		Student s3 = new Student("美景",22);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//如果想表示一样，应该覆写hashCode方法equals方法
		//如果想打印[良辰 - 18]覆写toString
		System.out.println(hs);
		System.out.println(hs.size());
	}
	
	
}
