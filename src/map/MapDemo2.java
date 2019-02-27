package map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	/**
	 * 遍历Map
	 * 	①for -- 索引 -- 不能
	 * 	②增强for(源的类型：源)(源必须数组)
	 * 	③迭代器
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map ages = new HashMap();
		ages.put("小明", 20);
		ages.put("小李", 22);
		ages.put("老王", 29);
		ages.put("老张", 40);
		ages.put("翠花", 26);
		
		Integer sum = 0;
		//取出所有年龄
		Collection c = ages.values();
		
		//遍历Collection
		for (Object obj : c) {
			//求和sum
			sum += (Integer)obj;
		}
		
		//通过keySet方式遍历Map
		Set s = ages.keySet();
		for(Object obj : s){
			//根据key取得value
			System.out.println("key:" +obj+"value:"+ages.get(obj));
		}
		System.out.println("--------------");
		Set<Entry<String,Integer>> entry = ages.entrySet();
		//通过entrySet方式遍历Map
		for (Object obj : entry) {
			Entry et = (Entry)obj;
			
			System.out.println("key:" + et.getKey() + " value:"+ et.getValue());
			
		}
//		System.out.println(sum/c.size());
	}

}
