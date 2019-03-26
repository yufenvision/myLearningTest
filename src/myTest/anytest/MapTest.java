package myTest.anytest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class MapTest {
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>(){{
			put("1","一");
			put("2","二");
			put("3","三");
			put("4","四");
		}};
		
		Object key[] = map.keySet().toArray();
		System.out.println(map.get(key[1]));
		
		int arr[] = new int[5];
		System.out.println(arr.length);
	}
	
	
	
	@Test
	public void seeMap() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>(){{
			put("1","一");
			put("2","二");
			put("3","三");
			put("4","四");
		}};
		System.out.println("=======用keySet,遍历key和value========");
		for (String in : map.keySet()) {
			System.out.println(in+":"+map.get(in));
		}
		
		System.out.println("=======用Map.entrySet遍历key和value，在大容量时推荐使用========");
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
		System.out.println("=======用Map.entrySet使用Iterator遍历key和value========");
		Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<String, Object> entry = iterator.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("=======只遍历值========");
		for (Object value : map.values()) {
			System.out.println(value);
		}
	}
}
