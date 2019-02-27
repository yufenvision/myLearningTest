package myPractise.interviewQuestion;

import java.util.Arrays;

public class StringRegexSplit {
	
	public static void charString(){
		char[] c = new char[]{'1'};
		String s = new String(c);
		
		System.out.println("abcd"+Arrays.toString(c));
		System.out.println("abcd"+s);
	}
	
	public static void main(String[] args) {
		String s = "1\\2\\3\\4";
		
		System.out.println(s);
		//如果是字符串，那么\\表示\
		//如果是正则表达式，那么\\\\表示\
		String[] result = s.split("\\\\");
		
		System.out.println(Arrays.toString(result));
		
		//-------------------------------
		charString();
	}
	
	
	
	
}
