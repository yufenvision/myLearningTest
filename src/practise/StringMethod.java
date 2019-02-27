package practise;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String s = "01234567";
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(1));
		s = s.concat("kkk");
		System.out.println(s);
		System.out.println(s.contains("K"));
		System.out.println(s.contentEquals("01234567kkk"));
		System.out.println(s.endsWith("kkk"));
		String s2 = " ";
		System.out.println(s2.length());
		System.out.println(s2.isEmpty());
		System.out.println(s.replace('k','A'));
		System.out.println("attention========="+s.substring(7,10));
		System.out.println("attention========="+Arrays.toString(s.split("\\\\")));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String sb1 = "   sd sdf sdfsda 123213   2134";
		System.out.println(sb1);
		System.out.println(sb1.trim());
	}

}
