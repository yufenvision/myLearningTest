package myTest.anyTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class CreateUUID {
	public static void main(String[] args) {
		
		
		System.out.println(UUID.randomUUID().toString().replaceAll("-" ,"" ));
		
		List<String> list = Collections.emptyList();

		Integer[] strs = {1,2,3,4,7,11,34};
		List<Integer> list1 = Arrays.asList(strs);
		
		System.out.println(list1.subList(1, 7));
	}
}
