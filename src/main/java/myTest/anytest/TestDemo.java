package myTest.anytest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TestDemo {
	public static void main(String[] args) throws Exception {
		
//		EnumTest[] em = EnumTest.values();
//		
//		for (EnumTest enumTest : em) {
//			System.out.print(enumTest+",");
//		}
//		System.out.println();
//		String uuid = UUID.randomUUID().toString().replace("-", "");
//		System.out.println(uuid);
		
		String url = "/sys/controller";
		boolean b = url.matches("^(?!auth).*$");
		System.out.println(b);
		
//		InterfaceDemo id = new ImplementDemo();
		System.out.println(UUID.randomUUID().toString().replace("-", ""));
		System.out.println(RIVER_LEVEL.get(1));
		
		System.out.println("1"==(new String("1")));
		
		System.out.println("--------------");
		int[] arr = {1,2,3,4,5};
		int index = 0;
		for (int i : arr) {
			System.out.println(arr[index]);
			index++;
		}
		
	}
	
	/** 河流级别 */
    public static final Map<Integer, String> RIVER_LEVEL = new HashMap<Integer, String>(){{
        put(1,"干流河");
        put(2,"一级");
        put(3,"二级");
        put(4,"三级");
        put(5,"四级");
        put(6,"五级");
        put(7,"六级");
        put(8,"七级");
        put(9,"八级");
        put(10,"未定级别");
    }};
}
