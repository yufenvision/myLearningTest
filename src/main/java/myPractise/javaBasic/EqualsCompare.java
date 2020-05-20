package myPractise.javaBasic;

public class EqualsCompare {
	
	public static Boolean yes_not(String str){
		Boolean result = false;
		switch (str) {
			case "是":
			result = true;
			break;
			case "否":
			result = false;
			break;
			default:
			break;
		}
		return result;
	}
	
	public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
	
	public static void main(String[] args) {
		int i = 18;
		Integer j = 18;
		System.out.println(j.equals(i));
		
		short s1 = 1;
		s1+= 1;//存在隐式转换s1 =(short)(s1+1);
		System.out.println(s1);
		
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.5));
		
		System.out.println(yes_not("是"));
		
		int x = 123456;
		String y = String.valueOf(x);
		int xy = Integer.parseInt(y);
		System.out.println(xy);
		
	}
	
	
}	
