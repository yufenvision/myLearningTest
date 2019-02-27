package practise;

public class IntegerDemo2 {
	/*
	 *使用 == 和equal比较 
	 * 
	*/
	public static void main(String[] args) {
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);//f
		System.out.println(i1.equals(i2));//t
		System.out.println("---------------");
		
//		Integer里面有个缓存，把经常使用的一些值，存放起来，范围【-128,127】
		Integer i3 = 123;
		Integer i4 = 123;
		System.out.println(i3 == i4);//t
		System.out.println(i3.equals(i4));//t
		System.out.println("---------------");
		
		Integer i11 = 1234;
		Integer i22 = 1234;
		System.out.println(i11 == i22);//f
		System.out.println(i11.equals(i22));//t
		
	}
}
