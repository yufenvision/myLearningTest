package myPractise.interviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class MapContainsKey {
	
	public static void main(String[] args) {
		Map<byte[],String> m = new HashMap<byte[],String>();
		byte[] key = "abcd".getBytes();
		m.put(key, "abcd");
		System.out.println(m.containsKey(key));//true
		System.out.println(m.containsKey("abcd"));//false
		System.out.println(m.containsKey("abcd".getBytes()));//false
		
	}
	
	
	
	
}
