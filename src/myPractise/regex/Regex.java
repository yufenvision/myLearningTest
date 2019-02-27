package myPractise.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^123+[0-9]*");
		
		String regex = "^this.*";
		String regex1 = "[a-zA-Z\\s]+";
		String regex2 = "[0-9]{1,}";
		String regex3 = "\\s+";
		String test = "this is a word";
		String test1 = "123353467";
		System.out.println(test.matches(regex));
		System.out.println(test.matches(regex1));
		System.out.println(test1.matches(regex2));
		System.out.println("  ".matches(regex3));
		System.out.println(p.matcher(test1).matches());
		
		compare();
	}

	public static void compare(){
		String demo = "1\\2\\3\\4\\5";
		String[] str = demo.split("\\\\");
		for (String string : str) {
			System.out.print(string);
		}
		System.out.println(Arrays.asList(str));
		
	}
	
	
	
}
