package myTest;

import java.util.Arrays;


public class StringTest {
	
	public static void main(String[] args) {
//		String s1 = "abc";
//		String s2 = "abc";
//		String s3 = "a"+"b"+"c";
//		System.out.println(s1==s2);//常量池
//		System.out.println(s1==s3);//常量池优化机制
//		System.out.println(s1.equals(s2));
//		
//		String s4 = new String("abc");//堆内存
//		System.out.println(s1==s4);
//		
//		String s5 = "ab";
//		String s6 = s5+"c";
//		System.out.println(s1==s6);//字符串拼接，生成新的string
//		System.out.println(s1.equals(s6));
//		
//		System.out.println(TestDemo.RIVER_LEVEL.get(1));
		
//		int num = 4;
//		while(num>0){
//			System.out.println((int)Math.floor(Math.random()*4));
//			num--;
//		}
//		System.out.println(String.valueOf((int)Math.floor(Math.random()*3)));
		
		String xx = "[chengduZ, wuhouqufhz, wuhouquHZB, chengdufhz, jiangxijiefhz, wuhouquZ, ximianqiaohz, chengduF, chengduhz, wuhouquZ, wuhouquhz, chengduHZB, jiangxijiehz, ximianqiaofhz]";
		System.out.println(xx.replaceAll("[\\[\\]]", ""));
		System.out.println(Arrays.asList(xx.replaceAll("[\\[\\]]", "").split(",")).subList(0, 3));
	}
}
