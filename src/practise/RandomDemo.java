package practise;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// 取出四位
		String str1 = "";
		for(int i = 0;i<4;i++){
			str1 += getOne();
		}
		System.out.println(str1);
	}
	
	public static String getOne(){
		String str = "123456789asdfghjkl%$";
//		从字符串里面随即取一个字符
		Random rd = new Random();
		int index = rd.nextInt(str.length()); 
		char c = str.charAt(index);
		return c+"";
	}
}
