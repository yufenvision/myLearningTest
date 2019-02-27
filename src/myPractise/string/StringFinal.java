package myPractise.string;

import java.util.Arrays;

public class StringFinal {
	
	
	
	public static void main(String[] args) {
		String a = "Hello2";
		
		final String b = "Hello";
		
		String a1 = "Hello";
		
		String c = getHello();
		
		String d = b+2;
		
		String e = a1+2;
		
		String f = c+2;
		
		System.out.println(a==d);
		System.out.println(a==e);
		System.out.println(a==f);
		System.out.println(a.equals(e));
		
		int i =0;
		int n = 5;
		int[] arr = new int[n];
		while(n-- !=0){
			System.out.println(n);
			arr[i]=i;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static String getHello() {
		// TODO Auto-generated method stub
		return "Hello";
	}
}
