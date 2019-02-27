package practise;

import java.io.IOException;
import java.util.Arrays;

public class SystemDemo1 {
	/*
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis(); 
		
		int [] src = {11,22,33,44,55};
		int [] dest = new int[20];
		
		System.arraycopy(src, 1, dest, 9, 3);
		System.out.println(dest);
		System.out.println(Arrays.toString(dest));
		
		long endTime = System.currentTimeMillis(); 
		System.out.println(endTime - startTime);
		
		Runtime.getRuntime().exec("calc");
		Runtime.getRuntime().exec("notepad");
	}
}
