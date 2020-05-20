package myTest.maploop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapLoop {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>(){
			{
				put("1","一");
				put("2","二");
				put("3","三");
				put("4","四");
			}
		};
//		entrySet(map);
//		keySet(map);
//		iterator(map);
		Student s = new Student(){{
			setName("哈哈哈");
			setAge("11");
		}};
		System.out.println(s);
		lambda(map);
	}
	
	//第一种遍历map方法
	public static void entrySet(Map<?,?> map){
		for (Entry entry : map.entrySet()) {
			System.err.print(entry.getKey()+"="+entry.getValue()+",");
		}
		System.out.println();
	}
	
	//第二种方法
	public static void keySet(Map<?,?> map){
		for(Object string : map.keySet()){
			System.out.print(string+":"+map.get(string)+",");
		}
		System.out.println();
	}
	
	//第三种方法
	public static void iterator(Map map){
		Iterator i = map.entrySet().iterator();
		while(i.hasNext()){
			Entry entry = (Entry) i.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
	
	// 第四种："第四种：通过Map.values()遍历所有的value，但不能遍历key";
	public static void values(Map<?,?> map){
		for (Object v : map.values()) {
			System.out.println("value= " + v);
		}
	}
	
	// 第五种:用lambda表达式
	
	public static void lambda(Map map){
		map.forEach( (k,v) -> {
			System.out.printf("键：%s | 值：%s\n",k,v);
		});
	}
}
