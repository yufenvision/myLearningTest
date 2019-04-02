package practise;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// ȡ����λ
		String str1 = "";
		for(int i = 0;i<4;i++){
			str1 += getOne();
		}
		System.out.println(str1);
	}
	
	public static String getOne(){
		String str = "123456789asdfghjkl%$";
//		���ַ��������漴ȡһ���ַ�
		Random rd = new Random();
		int index = rd.nextInt(str.length()); 
		char c = str.charAt(index);
		return c+"";
	}
}
