package myTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Regex {
	public static void main(String[] args) {
		
		String regex = ",|，";
		
		String str = "xx,士大夫撒，是打发斯蒂芬,sdfs，试试";
		
		String[] arr = str.split(regex);
		
		System.out.println(Arrays.toString(arr));
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println(simple.parse("1977-11-11"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
