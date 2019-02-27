package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 添加数据，把各位的qq号码和密码同意保存到一个集合容器中，使用哪种方式存储比较好。
 * qq号码		  	qq密码
 * key			value
 * 624029027	12456
 * 624029028	1245678
 * 624029029	12456789
 * 
 * 不能添加重复的键，会使用新值替换老值
 * 
 */
public class MapDemo {
	
	public static void main(String[] args) {
		Map<Object, String> m = new HashMap<Object, String>();
		m.put("624029027","12456");
		m.put("624029028","1245678");
		m.put("624029029","12456789");
		m.put("624029029","12456780");
		
		Map m1 = new HashMap();
		m1.put("1", "123");
		m1.put("2", "235");
		
		m.putAll(m1);
		m.remove("1");
		
		//把类A放到Map -- m里面
		m.put(new A(),"12345");
		
		//使用TreeMap和HashMap类似
		//创建TreeMap tm = new TreeMap();
		//把A放到TreeMap里面
		TreeMap tm = new TreeMap();
//		tm.put(new A(),"12345");
//		tm.put(new A(),"12345");
		
		
		System.out.println(m);
//		System.out.println(tm);
		System.out.println(m.size());
		System.out.println(m.containsKey("624029029"));
		System.out.println(m.containsValue("1245678"));
	}
	
}

class A{
	
}
